﻿using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3.Decorators
{
    public class ResizedImage : ImageDecorator
    {
        private double Ratio;

        public ResizedImage(IDrawable drawable, double ratio) : base(drawable)
        {
            Ratio = ratio;
        }

        public override Bitmap getBitmap()
        {
            Bitmap bitmap = BaseDrawable.getBitmap();
            return Resize(bitmap);
        }

        private Bitmap Resize(Bitmap bitmap)
        {
            throw new NotImplementedException();
            var newWidth = (int) (Ratio * 100);
            var newHeight = (int) (Ratio * 100);

            if (newWidth != 0 && newHeight != 0)
            {
                Bitmap bmap = new Bitmap(newWidth, newHeight, bitmap.PixelFormat);



                double fx, fy, nx, ny;
                int cx, cy, fr_x, fr_y;
                Color color1 = new Color();
                Color color2 = new Color();
                Color color3 = new Color();
                Color color4 = new Color();
                byte nRed, nGreen, nBlue;

                byte bp1, bp2;

                for (int x = 0; x < bmap.Width; ++x)
                {
                    for (int y = 0; y < bmap.Height; ++y)
                    {

                        fr_x = (int) Math.Floor(x * Ratio);
                        fr_y = (int) Math.Floor(y * Ratio);
                        cx = fr_x + 1;
                        if (cx >= bitmap.Width) cx = fr_x;
                        cy = fr_y + 1;
                        if (cy >= bitmap.Height) cy = fr_y;
                        fx = x * Ratio - fr_x;
                        fy = y * Ratio - fr_y;
                        nx = 1.0 - fx;
                        ny = 1.0 - fy;

                        color1 = bitmap.GetPixel(fr_x, fr_y);
                        color2 = bitmap.GetPixel(cx, fr_y);
                        color3 = bitmap.GetPixel(fr_x, cy);
                        color4 = bitmap.GetPixel(cx, cy);

                        // Blue
                        bp1 = (byte) (nx * color1.B + fx * color2.B);

                        bp2 = (byte) (nx * color3.B + fx * color4.B);

                        nBlue = (byte) (ny * (double) (bp1) + fy * (double) (bp2));

                        // Green
                        bp1 = (byte) (nx * color1.G + fx * color2.G);

                        bp2 = (byte) (nx * color3.G + fx * color4.G);

                        nGreen = (byte) (ny * (double) (bp1) + fy * (double) (bp2));

                        // Red
                        bp1 = (byte) (nx * color1.R + fx * color2.R);

                        bp2 = (byte) (nx * color3.R + fx * color4.R);

                        nRed = (byte) (ny * (double) (bp1) + fy * (double) (bp2));

                        bmap.SetPixel(x, y, System.Drawing.Color.FromArgb
                            (255, nRed, nGreen, nBlue));
                    }
                }

            }
        }


    }
}
