using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PSP3;

namespace PSI_extention.extections
{
    class ImageBrighnessAdjustor: ImageExtention
    {

        private int _brightness;
        public int Brightness
        {
            get { return _brightness; }
            set { SaveAdjustedBrightness(value); }
        }

        public ImageBrighnessAdjustor(Drawable baseDrawable, int brightness): base(baseDrawable)
        {
            SaveAdjustedBrightness(brightness);
        }

        public override Bitmap ModifyImage(Bitmap bitmap)
        {
            for (var i = 0; i < bitmap.Width; i++)
            {
                for (var j = 0; j < bitmap.Height; j++)
                {
                    Color c = bitmap.GetPixel(i, j);
                    var cR = c.R + _brightness;
                    var cG = c.G + _brightness;
                    var cB = c.B + _brightness;

                    if (cR < 0) cR = 1;
                    if (cR > 255) cR = 255;

                    if (cG < 0) cG = 1;
                    if (cG > 255) cG = 255;

                    if (cB < 0) cB = 1;
                    if (cB > 255) cB = 255;

                    bitmap.SetPixel(i, j, Color.FromArgb((byte) cR, (byte) cG, (byte) cB));
                }
            }
            return bitmap;
        }

        private void SaveAdjustedBrightness(int value)
        {
            if (value < -255)
            {
                _brightness = -255;
                return;
            }
            if (value > 255)
            {
                _brightness = 255;
                return;
            }
            _brightness = value;
        }
    }
}
