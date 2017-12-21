using System;
using System.Collections.Generic;
using System.Drawing;
using PSI_extention.Components;
using PSI_extention.extections;
using PSI_extention.Extentions;

namespace PSP3
{
    public abstract class AbstractExtendableComponent : IExtendableComponent
    {
        protected Dictionary<string, IExtention> Extentions = new Dictionary<string, IExtention>();

        public void AddExtention(string roleName, IExtention ext)
        {
            Extentions.Add(roleName, ext);
        }


        public IExtention GetExtention(string rolename)
        {
            IExtention extention;
            Extentions.TryGetValue(rolename, out extention);
            return extention;
        }

        public bool RemoveExtention(string roleName)
        {
            return Extentions.Remove(roleName);
        }

    }
}
