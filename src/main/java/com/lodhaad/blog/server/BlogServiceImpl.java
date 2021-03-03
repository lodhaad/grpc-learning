package com.lodhaad.blog.server;

import com.google.protobuf.Descriptors;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.blog.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Map;
import java.util.Set;

import static com.mongodb.client.model.Filters.eq;

public class BlogServiceImpl  extends BlogServiceGrpc.BlogServiceImplBase {

    private MongoClient client = MongoClients.create("mongodb://localhost:27017");
    private MongoDatabase database =  client.getDatabase("blogdb");
    private MongoCollection<Document> collection  = database.getCollection("blog");

    @Override
    public void createBlog(CreateBlogRequest request, StreamObserver<CreateBlogResponse> responseObserver) {

        Blog toCreate = request.getBlog();

        Map<Descriptors.FieldDescriptor, Object > allFields = toCreate.getAllFields();

        Set<Descriptors.FieldDescriptor> set = allFields.keySet();

        set.forEach(fd -> {
            System.out.println(fd.getName() + " fields");
        });

        Document document = new Document();
        document.append("author_id", toCreate.getAuthorId());
        document.append("content", toCreate.getContent());
        document.append("title", toCreate.getTitle());

        collection.insertOne(document);

        String id = document.getObjectId("_id").toString();

        CreateBlogResponse response = CreateBlogResponse.newBuilder().setBlog(toCreate.toBuilder().setId(id)).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();







    }


    @Override
    public void readBlog(ReadBlogRequest request, StreamObserver<ReadBlogResponse> responseObserver) {

        String blogId = request.getBlogId();

        Document result = collection.find(eq("_id" , new ObjectId(blogId))).first();

        if (result == null ) {

            responseObserver.onError(Status.NOT_FOUND.withDescription("This blog id does not exist ").asRuntimeException()

                    );

        }

        else {

            Blog blog =
                    Blog.newBuilder().setAuthorId(result.getString("author_id")).setTitle(result.getString("title")).
                            setContent(result.getString("context")).build();

            responseObserver.onNext(ReadBlogResponse.newBuilder().setBlog(blog).build());
            responseObserver.onCompleted();
        }


    }

    @Override
    public void updateBlog(UpdateBlogRequest request, StreamObserver<UpdateBlogRequest> responseObserver) {

       Blog blog =  request.getBlogToUpdate();

        System.out.println( " in the update blog request ");
    }
}
