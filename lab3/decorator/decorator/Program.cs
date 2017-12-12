using PSP3.Decorators;
using System;
using System.Drawing;

namespace PSP3
{
    class Program
    {
        const String routeToDesktop = "C:\\Users\\petri\\Desktop\\";
        static void Main(string[] args)
        {
            IDrawable image = new Image(new Bitmap(routeToDesktop + "FOTO\\tiger.jpg"));
            image.getBitmap().Save(routeToDesktop + "Output1.jpg");
            //image = new GreyScaleImage (image);
            image = new InvertedImage(image);
            image.getBitmap().Save(routeToDesktop + "Output2.jpg");
            var newImage = ((ImageDecorator)image).RemoveRole<InvertedImage>();
            newImage.getBitmap().Save(routeToDesktop + "Output3.jpg");
            newImage = new BrightnessImage(newImage, -100);
            newImage.getBitmap().Save(routeToDesktop + "Output4.jpg");
            ((ImageDecorator)newImage).GetRole<BrightnessImage>().Brightness = 100;
            newImage.getBitmap().Save(routeToDesktop + "Output5 .jpg");

        }
    }
}
