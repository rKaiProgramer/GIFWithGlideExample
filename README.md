 
# GIFWithGlideExample
### A simple example of loading GIF with Glide for [a question from Stackoverflow](https://stackoverflow.com/questions/73575949/having-troubles-loading-a-gif-image-in-my-application)

**Preview:**

<img src="https://github.com/rKaiProgramer/GIFWithGlideExample/blob/main/assets/screenshots/puppy.gif" width="162" height="351"/>\
&nbsp;

**AndroidManifest.xml:**

add internet permission
```
<uses-permission android:name="android.permission.INTERNET" />
```
&nbsp;

**build.gradle(:app):**

add Glide Library.
```
implementation 'com.github.bumptech.glide:glide:4.12.0'
```
&nbsp;

**activity_main.xml:**

add an ImageView
```
<ImageView
    android:id="@+id/imageView"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
```
&nbsp;

**MainActivity.kt:**

load GIF into imageView
```
 val url = "https://media.giphy.com/media/3o7527pa7qs9kCG78A/giphy.gif"
 Glide.with(this)
     .load(url)
     .into(imageView)
```
