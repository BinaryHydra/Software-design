using System;
using System.Collections.Generic;
using System.Drawing;
using PSI_extention.extections;

namespace PSP3
{
    public abstract class Drawable
    {
        protected Dictionary<Type, IImageExtention> Extentions = new Dictionary<Type, IImageExtention>();

        public abstract Bitmap GetBitmap();


        public void AddExtention<T>(T ext) where T : IImageExtention
        {
            Extentions.Add(typeof(T), ext);
        }


        public T GetExtention<T>() where T: IImageExtention
        {
            IImageExtention extention;
            Extentions.TryGetValue(typeof(T), out extention);
            return (T) extention;
        }

        public bool RemoveExtention<T>() where T : IImageExtention
        {
            return Extentions.Remove(typeof(T));
        }

    }
}
