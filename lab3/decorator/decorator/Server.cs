using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3
{
    /*    class Server: HttpServer {
            public Server(int port) : base(port, x1){
            }
            public override void handleGETRequest(HttpProcessor p)
            {
                Console.WriteLine("request: {0}", p.http_url);
                p.writeSuccess();
                p.outputStream.WriteLine("<html><body><h1>test server</h1>");
                p.outputStream.WriteLine("Current Time: " + DateTime.Now.ToString());
                p.outputStream.WriteLine("url : {0}", p.http_url);

                p.outputStream.WriteLine("<form method=post action=/form>");
                p.outputStream.WriteLine("<input type=text name=foo value=foovalue>");
                p.outputStream.WriteLine("<input type=submit name=bar value=barvalue>");
                p.outputStream.WriteLine("</form>");
            }
        }
        */
}
