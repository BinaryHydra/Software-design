using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3.Decorators
{
    public class BrightnessImage : ImageDecorator
    {
        private int _brightness;
        public int Brightness
        {
            get { return _brightness; }
            set { SaveAdjustedBrightness(value); }
        }

        public BrightnessImage(string roleName, IDrawable drawable, int brighnessVar) : base(roleName, drawable)
        {
            SaveAdjustedBrightness(brighnessVar);
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

        public override Bitmap getBitmap()
        {
            Bitmap bitmap = BaseDrawable.getBitmap();
            return ChangeBitmapBrightness(bitmap);
        }

        private Bitmap ChangeBitmapBrightness(Bitmap bitmap)
        {
            var bmap = (Bitmap)bitmap.Clone();

            for (var i = 0; i < bmap.Width; i++)
            {
                for (var j = 0; j < bmap.Height; j++)
                {
                    Color c = bmap.GetPixel(i, j);
                    var cR = c.R + _brightness;
                    var cG = c.G + _brightness;
                    var cB = c.B + _brightness;

                    if (cR < 0) cR = 1;
                    if (cR > 255) cR = 255;

                    if (cG < 0) cG = 1;
                    if (cG > 255) cG = 255; 

                    if (cB < 0) cB = 1;
                    if (cB > 255) cB = 255;

                    bmap.SetPixel(i, j, Color.FromArgb((byte)cR, (byte)cG, (byte)cB));
                }
            }
            return bmap;
        }
    }
}
