// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

public final class BlogOuterClass {
  private BlogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Blog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Blog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_ReadBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_ReadBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_ReadBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_ReadBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_UpdateBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_UpdateBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_UpdateBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_UpdateBlogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_DeleteBlogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_DeleteBlogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_DeleteBlogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_DeleteBlogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017blog/blog.proto\022\004blog\"E\n\004Blog\022\n\n\002id\030\001 " +
      "\001(\t\022\021\n\tauthor_id\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\017\n" +
      "\007content\030\004 \001(\t\"-\n\021CreateBlogRequest\022\030\n\004b" +
      "log\030\001 \001(\0132\n.blog.Blog\".\n\022CreateBlogRespo" +
      "nse\022\030\n\004blog\030\001 \001(\0132\n.blog.Blog\"\"\n\017ReadBlo" +
      "gRequest\022\017\n\007blog_id\030\001 \001(\t\",\n\020ReadBlogRes" +
      "ponse\022\030\n\004blog\030\001 \001(\0132\n.blog.Blog\"5\n\021Updat" +
      "eBlogRequest\022 \n\014blogToUpdate\030\001 \001(\0132\n.blo" +
      "g.Blog\".\n\022UpdateBlogResponse\022\030\n\004blog\030\001 \001" +
      "(\0132\n.blog.Blog\"#\n\021DeleteBlogRequest\022\016\n\006b" +
      "logId\030\001 \001(\t\"4\n\022DeleteBlogResponse\022\016\n\006blo" +
      "gId\030\001 \001(\t\022\016\n\006status\030\002 \001(\t2\222\002\n\013BlogServic" +
      "e\022A\n\nCreateBlog\022\027.blog.CreateBlogRequest" +
      "\032\030.blog.CreateBlogResponse\"\000\022;\n\010ReadBlog" +
      "\022\025.blog.ReadBlogRequest\032\026.blog.ReadBlogR" +
      "esponse\"\000\022@\n\nUpdateBlog\022\027.blog.UpdateBlo" +
      "gRequest\032\027.blog.UpdateBlogRequest\"\000\022A\n\nD" +
      "eleteBlog\022\027.blog.DeleteBlogRequest\032\030.blo" +
      "g.DeleteBlogResponse\"\000B\022\n\016com.proto.blog" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_blog_Blog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blog_Blog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Blog_descriptor,
        new java.lang.String[] { "Id", "AuthorId", "Title", "Content", });
    internal_static_blog_CreateBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_blog_CreateBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogRequest_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_CreateBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_blog_CreateBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_ReadBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_blog_ReadBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_ReadBlogRequest_descriptor,
        new java.lang.String[] { "BlogId", });
    internal_static_blog_ReadBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_blog_ReadBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_ReadBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_UpdateBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_blog_UpdateBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_UpdateBlogRequest_descriptor,
        new java.lang.String[] { "BlogToUpdate", });
    internal_static_blog_UpdateBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_blog_UpdateBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_UpdateBlogResponse_descriptor,
        new java.lang.String[] { "Blog", });
    internal_static_blog_DeleteBlogRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_blog_DeleteBlogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_DeleteBlogRequest_descriptor,
        new java.lang.String[] { "BlogId", });
    internal_static_blog_DeleteBlogResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_blog_DeleteBlogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_DeleteBlogResponse_descriptor,
        new java.lang.String[] { "BlogId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
