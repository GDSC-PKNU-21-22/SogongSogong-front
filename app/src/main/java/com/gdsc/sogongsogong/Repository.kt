package com.gdsc.sogongsogong

import com.gdsc.sogongsogong.data.entity.Post
import com.gdsc.sogongsogong.fake.DtoDatas
import com.gdsc.sogongsogong.data.retrofit.ApiService
import retrofit2.Response

class Repository {
//    suspend fun pushPost(userId: Long, postId: Long, subject: String, content: String): Response<Post> {
//        return RetrofitInstance.api.pushPost(userId, postId, subject, content)
//    }

    suspend fun pushPost2(userId: Long, postId: Long, subject: String, content: String) {
        ApiService.api.pushPost2(pushPost2Dto = DtoDatas.pushPost2Dto( userId, postId, subject, content ))
    }

//    suspend fun pushComment(): Response<Post> {
//        return RetrofitInstance.api.pushComment()
//    }

//    suspend fun pushComment2(userId: Long, postId: Long, content: String): Response<Post> {
//        return RetrofitInstance.api.getPost2(userId, postId, content)
//    }

//    suspend fun pushScraplike(): Response<Post> {
//        return RetrofitInstance.api.getPost()
//    }

//    suspend fun pushScraplike2(userId: Long, postId: Long, category: Boolean): Response<Post> {
//        return RetrofitInstance.api.getPost2(userId, postId, category)
//    }

    suspend fun getPostAuth(): Response<Post> {
        return ApiService.api.getPostAuth()
    }

//    suspend fun getPostAuth2(userId: Long, postId: Long): Response<Post> {
//        return RetrofitInstance.api.getPostAuth2(userId, postId)
//    }

    suspend fun getCommentAuth(): Response<Post> {
        return ApiService.api.getCommentAuth()
    }

//    suspend fun getCommentAuth2(userId: Long, commentId: Long): Response<Post> {
//        return RetrofitInstance.api.getCommentAuth2(userId, commentId)
//    }

//    suspend fun putPost(postId: Long, sort: String, order: String): Response<List<Post>> {
//        return RetrofitInstance.api.putPost(postId, sort, order)
//    }

//    suspend fun putComment(userId: Long, content: Map<String, String>): Response<List<Post>> {
//        return RetrofitInstance.api.putComment(userId, content)
//    }

//    suspend fun deletePost(postId: Long): Response<Post> {
//        return RetrofitInstance.api.deletePost(postId)
//    }

//    suspend fun deleteComment(commentId: Long): Response<Post> {
//        return RetrofitInstance.api.pushPost2(commentId)
//    }

    suspend fun getEntirePost(): Response<Post> {
        return ApiService.api.getEntirePost()
    }

    suspend fun getEntirePost2(lastPost: Long): Response<Post> {
        return ApiService.api.getEntirePost2(lastPost)
    }

    suspend fun getOnePost(): Response<Post> {
        return ApiService.api.getOnePost()
    }

//    suspend fun getOnePost2(postId : Long): Response<Post> {
//        return RetrofitInstance.api.getOnePost2(postId)
//    }

    suspend fun getOnePostComment(): Response<Post> {
        return ApiService.api.getOnePostComment()
    }

//    suspend fun getOnePostComment2(postId : Long, lastComment:Long): Response<Post> {
//        return RetrofitInstance.api.getOnePostComment2(postId, lastComment)
//    }

    suspend fun getOnePostScarpLike(): Response<Post> {
        return ApiService.api.getOnePostScarpLike()
    }

//    suspend fun getOnePostScarpLike2(userId : Long, scrapLike:Boolean, lastScrap:Long): Response<Post> {
//        return RetrofitInstance.api.getOnePostScarpLike2(userId, scrapLike, lastScrap)
//    }
    suspend fun getHotPost(): Response<Post> {

    return ApiService.api.getHotPost()
    }

    suspend fun getHotPost2(lastPost : Long): Response<Post> {
        return ApiService.api.getHotPost2(lastPost)
    }

    suspend fun getBestPost(): Response<Post> {
        return ApiService.api.getBestPost()
    }

    suspend fun getBestPost2(lastPost : Long): Response<Post> {
        return ApiService.api.getBestPost2(lastPost)
    }
    suspend fun postHashtag(post: Post): Response<Post> {
        return ApiService.api.postHashtag(post)
    }

//    suspend fun postHashtag2(postId: Post, hashName: List<String>): Response<Post> {
//        return RetrofitInstance.api.postHashtag2(postId, hashName)
//    }


//    suspend fun putHashtag(postId: Post, hashName: List<String>): Response<Post> {
//        return RetrofitInstance.api.putHashtag(postId, hashName)
//    }

    suspend fun getHashtagPost(): Response<Post> {
        return ApiService.api.getHashtagPost()
    }
//    suspend fun getHashtagPost2(postId: Post): Response<Post> {
//        return RetrofitInstance.api.getHashtagPost2(postId)
//    }

//    suspend fun postHashtagUser(post: Post): Response<Post> {
//        return RetrofitInstance.api.getHashtagPost2(post)
//    }

//    suspend fun postHashtagUser2(userId: Long, hashName: List<String>): Response<Post> {
//        return RetrofitInstance.api.getHashtagPost(userId, hashName)
//    }

//    suspend fun putHashtagUser(): Response<Post> {
//        return RetrofitInstance.api.putHashtagUser()
//    }

    suspend fun getHashtagUser2(userId : Long): Response<Post> {
        return ApiService.api.getHashtagUser2(userId)
    }
    suspend fun getHashtagSearchBar(): Response<Post> {
        return ApiService.api.getHashtagSearchBar()
    }
    suspend fun getHashtagSearchBar2(hashtag : List<String>, lastPost : Long): Response<Post> {
        return ApiService.api.getHashtagSearchBar2(hashtag, lastPost)
    }
    suspend fun getHashtagSearchBoard(): Response<Post> {
        return ApiService.api.getHashtagSearchBoard()
    }
    suspend fun getHashtagSearchBoard2(userId : Long, lastPost : Long): Response<Post> {
        return ApiService.api.getHashtagSearchBoard2(userId, lastPost)
    }
    suspend fun getUserBusiness(): Response<Post> {
        return ApiService.api.getUserBusiness()
    }

//    suspend fun getUserBusiness2(num: String, startDate: String, pName: String): Response<Post> {
//        return RetrofitInstance.api.getUserBusiness2(num, startDate, pName)
//    }
}