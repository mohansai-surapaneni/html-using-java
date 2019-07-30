import java.io.*;
import java.util.*;
class htmltab
{
	public static void main(String args[]) throws Exception
	{
		int r,c,i,j;
		String title="",heading="",str="";
		Scanner m = new Scanner(System.in);
		System.out.print("Enter No.of Rows and Columns : ");
		r = m.nextInt();
		c = m.nextInt();
		Scanner read = new Scanner(System.in);
		System.out.print("Enter file name : ");
		String filename = read.nextLine();
		System.out.print("Enter the Title : ");
		title = read.nextLine();
		System.out.print("Enter the Heading :");
		heading = read.nextLine();
		FileWriter fw = new FileWriter(filename);
		fw.write("<html>\n<head>\n");
		fw.write("\t<title>"+title+"</title>\n</head>\n<body>\n");
		fw.write("<center>\n");
		fw.write("\t<h1>"+heading+"</h1>\n");
		fw.write("</center>\n");
		fw.write("\t<table border = 1>\n");
		fw.write("\t\t<tr>\n");
		fw.write("\t\t\t<th>Sl.no</th>\n");
		for(j=1;j<=c;j++)
		{
			System.out.print(j+").Enter table heading : ");
			str = read.nextLine();
			fw.write("\t\t\t<th>"+str+"</th>\n");
		}
		fw.write("\t\t</tr>\n");
		for(i=1;i<=r;i++)
		{
			fw.write("\t\t<tr>\n");
			fw.write("\t\t\t<td>"+i+"</td>\n");
			for(j=1;j<=c;j++)
			{
				System.out.print(i+":"+j+").Enter table data : ");
				str = read.nextLine();
				fw.write("\t\t\t<td>"+str+"</td>\n");
			}
			fw.write("\t\t</tr>\n");
		}
		fw.write("\t</table>\n</body>\n</html>\n");
		//System.out.print(title+"  "+heading+"  "+r+"  "+c);
		fw.close();
	}
}
		