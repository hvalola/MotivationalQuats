//package com.pubudu.motivationalquats.framework.controller
//
//import android.app.Application
//import android.content.Context
//import android.text.TextUtils
//import com.android.volley.Request
//import com.android.volley.RequestQueue
//import com.android.volley.toolbox.Volley
//
//
//public class AppController: Application() {
//
//    val TAG = AppController::class.java
//        .simpleName
//    private var mInstance: AppController? = null
//    private var mRequestQueue: RequestQueue? = null
//    private lateinit var myContext :Context
//
//    @Synchronized
//    fun getInstance(): AppController? {
//        return mInstance
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        mInstance = this
//    }
//
//    companion object {
//        lateinit var instance: AppController
//            private set
//    }
//    fun getRequestQueue(): RequestQueue? {
//        if (mRequestQueue == null) {
//            mRequestQueue = Volley.newRequestQueue(myContext)
//        }
//        return mRequestQueue
//    }
//
//    override fun attachBaseContext(base: Context?) {
//        super.attachBaseContext(base)
//        if (base != null) {
//            myContext = base
//        }
//    }
////    public ImageLoader getImageLoader() {
////        getRequestQueue();
////        if (mImageLoader == null) {
////            mImageLoader = new ImageLoader(this.mRequestQueue,
////                    new LruBitmapCache());
////        }
////        return this.mImageLoader;
////    }
//
//    //    public ImageLoader getImageLoader() {
//    //        getRequestQueue();
//    //        if (mImageLoader == null) {
//    //            mImageLoader = new ImageLoader(this.mRequestQueue,
//    //                    new LruBitmapCache());
//    //        }
//    //        return this.mImageLoader;
//    //    }
//    fun <T> addToRequestQueue(req: Request<T>, tag: String?) {
//        // set the default tag if tag is empty
//        req.setTag(if (TextUtils.isEmpty(tag)) TAG else tag)
//        getRequestQueue()!!.add<T>(req)
//    }
//
//    fun <T> addToRequestQueue(req: Request<T>) {
//        req.setTag(TAG)
//        getRequestQueue()!!.add<T>(req)
//    }
//
//    fun cancelPendingRequests(tag: Any?) {
//        if (mRequestQueue != null) {
//            mRequestQueue!!.cancelAll(tag)
//        }
//    }
//}