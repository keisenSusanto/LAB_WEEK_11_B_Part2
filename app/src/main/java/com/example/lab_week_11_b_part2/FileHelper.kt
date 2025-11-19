package com.example.lab_week_11_b_part2

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import java.io.File

class FileHelper(private val context: Context) {

    // Generate a temporary URI to access the file
    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(
            context,
            "com.example.lab_week_11_b_part2.fileprovider",
            file
        )
    }

    // Get Pictures folder name (matches XML path)
    fun getPicturesFolder(): String =
        Environment.DIRECTORY_PICTURES

    // Get Videos folder name (matches XML path)
    fun getVideosFolder(): String =
        Environment.DIRECTORY_MOVIES
}
