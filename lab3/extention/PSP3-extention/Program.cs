using System;
using System.Drawing;
using PSI_extention.extections;
using PSP3;
using Image = PSP3.Image;

namespace PSI_extention
{
    class Program
    {
        const String routeToDesktop = "C:\\Users\\petri\\Desktop\\";
        static void Main(string[] args)
        {
            Drawable image = new Image(new Bitmap(routeToDesktop + "FOTO\\tiger.jpg"));
            image.GetBitmap().Save(routeToDesktop + "EXT_Output1.jpg");
            //image.AddExtention(new ImageGreyScaler());
            image.AddExtention(new ImageInverter());
            image.GetBitmap().Save(routeToDesktop + "EXT_Output2.jpg");
            image.RemoveExtention<ImageInverter>();
            image.GetBitmap().Save(routeToDesktop + "EXT_Output3.jpg");
            image.AddExtention(new ImageBrighnessAdjustor(-100));
            image.GetBitmap().Save(routeToDesktop + "EXT_Output4.jpg");
            image.GetExtention<ImageBrighnessAdjustor>().Brightness = 100;
            image.GetBitmap().Save(routeToDesktop + "EXT_Output5 .jpg");

        }
    }
}

