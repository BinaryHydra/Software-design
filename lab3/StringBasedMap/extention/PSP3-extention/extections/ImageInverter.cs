﻿using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PSP3;

namespace PSI_extention.extections
{
    public class ImageInverter: ImageExtention
    {
        public ImageInverter(Drawable decoratable) : base(decoratable)
        {
        }

        public override Bitmap ModifyImage(Bitmap bitmap)
        {
            for (int i = 0; i < bitmap.Width; i++)
            {
                for (int j = 0; j < bitmap.Height; j++)
                {
                    Color c = bitmap.GetPixel(i, j);
                    bitmap.SetPixel(i, j, Color.FromArgb(255 - c.R, 255 - c.G, 255 - c.B));
                }
            }
            return bitmap;
        }
    }
}
