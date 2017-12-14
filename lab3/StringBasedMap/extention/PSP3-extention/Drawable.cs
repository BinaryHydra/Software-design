using System;
using System.Collections.Generic;
using System.Drawing;
using PSI_extention.extections;

namespace PSP3
{
    public abstract class Drawable
    {
        protected Dictionary<string, ImageExtention> Extentions = new Dictionary<string, ImageExtention>();

        public abstract Bitmap GetBitmap();


        public void AddExtention(string roleName,ImageExtention ext)
        {
            Extentions.Add(roleName, ext);
        }


        public ImageExtention GetExtention(string rolename)
        {
            ImageExtention extention;
            Extentions.TryGetValue(rolename, out extention);
            return extention;
        }

        public bool RemoveExtention(string roleName)
        {
            return Extentions.Remove(roleName);
        }

    }
}
