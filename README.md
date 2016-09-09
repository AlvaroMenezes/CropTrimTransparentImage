# Crop / Trim Transparent Border <br>

Android code to crop / trim transparent border of a bitmap.<br>
This code cut a squared image.<br><br>
Easy and fast way to trim as images bellow <br>


<p align="center">
  <img title="BEFORE"  src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/before.png" width="350"/>
  <img title="AFTER"  src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/after.png" width="350"/>
</p>

##How to use

```java

	Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.your_img);
	CropTransparent ct = new CropTransparent();
	imageView.setImageBitmap(ct.crop(bmp));

```
  Easy just add this [class](/Project/app/src/main/java/alvaromenezes/com/trimimage/CropTransparent.java) into your project



##Developed By
Álvaro Menezes - <alvaromenezes.inf@gmail.com>


##License
```

FREE! Use as you like ;)

```