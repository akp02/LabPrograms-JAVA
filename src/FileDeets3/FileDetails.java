/*3. Write a java program that reads a file name from the user, 
and then displays information about whether the file exists, 
whether the file is readable, whether the file is writable, 
the type of file and the length of the file in bytes. */
package FileDeets3;

import java.io.*;
class filedemo
{
    public static void p(String str)
    {
        System.out.println(str);
    }
    public void analyze(String s){
        File f=new File(s);
        if(f.exists())
        {
            p(f.getName()+" file exist");
            p(f.canRead() ? " is readable":" is not readable");
            p(f.canWrite() ? " is writable":" is not writable");
            p("Filesize:" + f.length() + " bytes");
            p("File last mdified:" + f.lastModified());
        }
        if(!f.exists()){
            p("File does not exist");
        }
        if(f.isDirectory())
        {
            p(f.getName()+" is directory");
            p("List of files");
            String dir[]=f.list();
            for(int i=0;i<dir.length;i++)
            p(dir[i]);
        }
    }

}
public class FileDetails
{
    public static void main(String rr[])throws IOException
    {
        filedemo fd=new filedemo();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name:");
        String s=br.readLine();
        fd.analyze(s);
    }
}
