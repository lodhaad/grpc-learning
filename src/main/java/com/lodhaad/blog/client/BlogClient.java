package com.lodhaad.blog.client;

import com.proto.blog.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BlogClient {

    public void run () {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).
                usePlaintext().build();

        createBlog(channel);

        //readBlog(channel);

        channel.shutdown();

    }

    private void createBlog (ManagedChannel channel ) {

        BlogServiceGrpc.BlogServiceBlockingStub blogService = BlogServiceGrpc.newBlockingStub(channel);

        Blog blog = Blog.newBuilder().setAuthorId("lodhaad")
                .setContent("This is my second blog in DB")
                .setTitle("Tech Blog").build();

        CreateBlogRequest request = CreateBlogRequest.newBuilder().setBlog(blog).build();

        CreateBlogResponse response = blogService.createBlog(request);

        System.out.println(response.getBlog().getContent());

    }


    private void readBlog(ManagedChannel channel) {

        BlogServiceGrpc.BlogServiceBlockingStub blogService = BlogServiceGrpc.newBlockingStub(channel);

        ReadBlogRequest request = ReadBlogRequest.newBuilder().setBlogId("5edc693e49dfa83aee8395b1").build();

        ReadBlogResponse response = blogService.readBlog(request);

        System.out.println(response.getBlog().getContent());


    }

    public static void main(String[] args) {

        System.out.println("Starting the blog client ");

        BlogClient client = new BlogClient();
        client.run();

    }
}
