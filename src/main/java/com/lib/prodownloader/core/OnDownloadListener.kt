package com.lib.prodownloader.core

import java.io.File

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    21/6/2019
 * Email:   alirezat775@gmail.com
 */

interface OnDownloadListener {
    fun onStart()
    fun onPause()
    fun onResume()
    fun onProgressUpdate(progress: Int, downloadedBytes: Int, totalBytes: Int)
    fun onCompleted(file: File?)
    fun onFailure(reason: String?)
    fun onCancel()
}
