using System;
using System.Collections.Generic;
using System.Drawing;
using PSI_extention.extections;

namespace PSP3
{
    public abstract class Drawable
    {
        protected Dictionary<string, IImageExtention> Extentions = new Dictionary<string, IImageExtention>();

        public abstract Bitmap GetBitmap();


        public void AddExtention(string roleName,IImageExtention ext)
        {
            Extentions.Add(roleName, ext);
        }


        public IImageExtention GetExtention(string rolename)
        {
            IImageExtention extention;
            Extentions.TryGetValue(rolename, out extention);
            return extention;
        }

        public bool RemoveExtention(string roleName)
        {
            return Extentions.Remove(roleName);
        }

    }
}
