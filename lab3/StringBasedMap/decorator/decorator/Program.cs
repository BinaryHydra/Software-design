using PSP3.Decorators;
using System.Drawing;

namespace PSP3
{
    class Program
    {
        private const string RouteToDesktop = "C:\\Users\\petri\\Desktop\\";
        static void Main(string[] args)
        {
            IDrawable image = new Image(new Bitmap(RouteToDesktop + "FOTO\\tiger.jpg"));
            //image.getBitmap().Save(RouteToDesktop + "Output1.jpg");
            //image = new GreyScaleImage ("greyScaler", image);
            image = new InvertedImage("inverter", image);
            //image.getBitmap().Save(RouteToDesktop + "Output2.jpg");
            //var newImage = ((ImageDecorator)image).RemoveRole("inverter");
            //newImage.getBitmap().Save(RouteToDesktop + "Output3.jpg");
            image = new BrightnessImage("brighness adjustor",image, -100);
            //newImage.getBitmap().Save(RouteToDesktop + "Output4.jpg");
            ((BrightnessImage)((ImageDecorator)image).GetRole("brighness adjustor")).Brightness = 100;
            //newImage.getBitmap().Save(RouteToDesktop + "Output5.jpg");
            image = new ResizedImage("x2", image, 2);
            image.GetBitmap().Save(RouteToDesktop + "Enlarged.jpg");
        }
    }
}
