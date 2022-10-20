using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ACTIVITY6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<char> baselist = new List<char> { 'S', 'X', 'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R' };
            bool doit = true;
            do
            {
                Console.WriteLine("=========================");
                Console.WriteLine("|  X C O M P U T E R S  |");
                Console.WriteLine("|  1 2 3 4 5 6 7 8 9 0  |");
                Console.WriteLine("=========================");

                Console.WriteLine("ENTER CODE TO CONVERT A NUMBERS:");

                string input = Console.ReadLine();
                int indexc = input.Length;
                List<char> mylist = new List<char>(indexc);
                for (int count = 0; count != indexc; count++)
                {
                    string a = input[count].ToString().ToUpper();
                    if (baselist.Contains(Convert.ToChar(a)) is (true))
                    {
                        mylist.Add(Convert.ToChar(a));
                        doit = false;
                    }
                    else
                    {
                        Console.WriteLine("Invalid CODE");
                        break;
                    }
                }
                foreach (char c in mylist)
                {
                    int code = baselist.IndexOf(c);
                    Console.Write(code);
                }
                Console.ReadKey();
                Console.Clear();
            } while (doit = true);
        }
    }
}
