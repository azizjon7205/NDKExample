#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_example_ndkexample_MyApp_getPublicKey(JNIEnv *env, jobject instance) {
    return (*env)->  NewStringUTF(env, "long_public_key");
}
JNIEXPORT jstring JNICALL
Java_com_example_ndkexample_MyApp_getPrivateKey(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "long_private_key");
}