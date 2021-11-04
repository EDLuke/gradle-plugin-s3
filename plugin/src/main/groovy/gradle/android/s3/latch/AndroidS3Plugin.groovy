package gradle.android.s3.latch

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidS3Extension {
    String accessKey, secretKey;
    String bucketName, keyPrefix, uploadPath;
}

class AndroidS3Plugin implements Plugin<Project> {
    void apply(Project target) {
        // target.extensions.create("s3", AndroidS3Extension)
        // target.tasks.create('uploadApk', UploadTask)
        project.task('hello') {
            doLast {
                println 'Hello from the GreetingPlugin'
            }
        }
    }
}