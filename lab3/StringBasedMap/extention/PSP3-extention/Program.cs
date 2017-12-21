using System;
using System.Drawing;
using PSI_extention.Components;
using PSI_extention.extections;
using PSI_extention.Extentions;
using Image = PSP3.Image;

namespace PSI_extention
{
    class Program
    {
        const String routeToDesktop = "C:\\Users\\petri\\Desktop\\";
        static void Main(string[] args)
        {
            IDrawable image = new Image(new Bitmap(routeToDesktop + "FOTO\\tiger.jpg"));
            image.GetBitmap().Save(routeToDesktop + "EXT_Output1.jpg");
            //((IExtendableComponent)image).AddExtention("greyscaler",new ImageGreyScaler());
            ((IExtendableComponent)image).AddExtention("inverter", new ImageInverter());
            image.GetBitmap().Save(routeToDesktop + "EXT_Output2.jpg");
            ((IExtendableComponent)image).RemoveExtention("inverter");
            image.GetBitmap().Save(routeToDesktop + "EXT_Output3.jpg");
            ((IExtendableComponent)image).AddExtention("brigness adjustor",new ImageBrighnessAdjustor(-100));
            image.GetBitmap().Save(routeToDesktop + "EXT_Output4.jpg");
            ((IExtendableComponent)image).GetExtention<ImageBrighnessAdjustor>("brigness adjustor").Brightness = 100;
            //((ImageBrighnessAdjustor)((IExtendableComponent)image).GetExtention("brigness adjustor")).Brightness = 100;
            image.GetBitmap().Save(routeToDesktop + "EXT_Output5.jpg");
            ((IExtendableComponent)image).AddExtention("Size x2", new ImageResizer(2, image));
            image.GetBitmap().Save(routeToDesktop + "EXT_Bigger.jpg");

        }
    }
}

