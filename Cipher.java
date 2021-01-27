/*
Enter the first key :
zgptfoihmuwdrcnnykeqazvsbl
Enter the second Key: 
mfnbdcrhsaxyogvituewlqzkp
Cipher Text : tiybfhznybzbby

Decryption:

Plain Text : attackcatadawn
*/
import java.io.*;
public class Cipher {
    public static char[][] play1=new char[5][5];
    public static char[][] play2=new char[5][5];
    public static char[][] play3=new char[5][5];
    public static char[][] play4=new char[5][5];
    public static char[][] cipher_matrix(String key)
    {
        int i,j,p,f,l,k,y;
        char st[]=new char[26];
        char[][] play=new char[5][5];
        p=0;
        f=0;
        i=0;
        while(p<key.length())
        {
        char x=key.charAt(p);
        if(Character.isLetter(x))
        {
        if(i==0)
        {
        st[i]=x;
        i++;
        }
        else
        {
        f=0;
        for(j=0;j<=i;j++)
        {
        if(st[j]==x)
        {
        f=1;
        break;
        }
        }
        if(f!=1)
        {
        st[i]=x;
        i++;
        }
        }
        }
        p++;
        }
        st[i]='\0';
        k=0;
        l=97;
        for(i=0;i<5;i++)
        {
        for(j=0;j<5;j++)
        {
        if(k<st.length && st[k]!='\0')
        {
        play[i][j]=st[k];
        k++;
        }
        else
        {
        do
        {
        char x= (char)l;
        f=0;
        for(y=0;y<st.length-1;y++)
        {
        if(st[y]==x)
        {
        f=1;
        break;
        }
        }
        if(f==0)
        {
        play[i][j]=x;
        }
        if(l==105)
        {
        l=l+2;
        }
        else
        l++;
        }while(f!=0);
        }
        }
        }
        return play;
    }
    public static String decryption(String s,String key1,String key2)
    {
        int i,j,k;
        k=97;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                play1[i][j]=(char)k;
                play4[i][j]=(char)k;
                if((char)k=='i')
                    k++;
                k++;
            }
        }
        play2=cipher_matrix(key1);
        play3=cipher_matrix(key2);
        if((s.length()%2)!=0)
        {
            int x=s.length()%2;
            for(i=0;i<x;i++)
            {
                s=s+'x';
            }
        }
        int r1=0,r2=0,c1=0,c2=0;
        String str="";
        for(k=0;k<s.length();k=k+2)
        {
            char x1=s.charAt(k);
            char x2=s.charAt(k+1);
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                    if(x1==play2[i][j])
                    {
                        r1=i;
                        c2=j;
                        break;
                    }
                }
            }
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                    if(x2==play3[i][j])
                    {
                        r2=i;
                        c1=j;
                        break;
                    }
                }
            }
        str=str+play1[r1][c1]+play4[r2][c2];
        }
    return str;
    }
    public static String encryption(String s,String key1,String key2)
    {
        int i,j,k;
        k=97;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                play1[i][j]=(char)k;
                play4[i][j]=(char)k;
                if((char)k=='i')
                    k++;
                k++;
            }
        }
        play2=cipher_matrix(key1);
        play3=cipher_matrix(key2);
        if((s.length()%2)!=0)
        {
            int x=s.length()%2;
            for(i=0;i<x;i++)
            {
                s=s+'x';
            }
        }
        int r1=0,r2=0,c1=0,c2=0;
        String str="";
        for(k=0;k<s.length();k=k+2)
        {
            char x1=s.charAt(k);
            char x2=s.charAt(k+1);
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                    if(x1==play1[i][j])
                    {
                        r1=i;
                        c1=j;
                        break;
                    }
                }
            }
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                    if(x2==play4[i][j])
                    {
                        r2=i;
                        c2=j;
                        break;
                    }
                }
            }
        str=str+play2[r1][c2]+play3[r2][c1];
        }
        return str;
    }
    public static void main(String[] args) throws IOException{
    FileInputStream is=new FileInputStream(new File("input.txt"));
    InputStreamReader isr=new InputStreamReader(System.in);
    InputStreamReader isf=new InputStreamReader(is);
    BufferedReader br=new BufferedReader(isr);
    BufferedReader bf=new BufferedReader(isf);
    String s,str,str1;
    if((s=bf.readLine())!=null)
    {
    }
    else
    {
        System.out.println("File is empty!!");
    }
    System.out.println("Enter the first key :");
    String key1=br.readLine();
    System.out.println("Enter the second Key: ");
    String key2=br.readLine();
    str=encryption(s,key1,key2);
    System.out.println("Encrypted Text : "+str);
    // System.out.println("\nDecrypted Text:\n");
    str1=decryption(str,key1,key2);
    System.out.println("\nDecrypted Text: "+str1);
}}