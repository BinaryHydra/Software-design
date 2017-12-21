using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PSI_extention.extections;
using PSI_extention.Extentions;

namespace PSI_extention.Components
{
    public interface IExtendableComponent
    {
        void AddExtention(string roleName, IExtention ext);

        IExtention GetExtention(string rolename);

        bool RemoveExtention(string roleName);

        T GetExtention<T>(string rolename) where T : class, IExtention;

    }
}
