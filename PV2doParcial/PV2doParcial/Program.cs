/* Gomez Ponce Erick Alonso */
/* 2do parcial*/
using System;
using System.Collections;

namespace PV2doParcial
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("ingresa la ecuacion "); 
            String var1 = Console.ReadLine();
            Stack paretnesis = new Stack();
            for (int i = 0; i < var1.Length; ++i)
            {
                if ((var1[i] == '(') || (var1[i] == '{') || (var1[i] == '[')) 
                {
                    paretnesis.Push(var1[i]);//coloca el iterador al final de la pila
                }
                else if (paretnesis.Count > 0)
                {//entonces si el parentesis esta vacio es falso
                    switch (var1[i])
                    {//switch case con el iterador del array
                        case ']'://caso ]

                            paretnesis.Pop();
                            break;
                        case '}'://caso}

                            paretnesis.Pop();
                            break;
                        case ')'://caso )
                            paretnesis.Pop();
                            break;
                    }//cierra switch case
                }//cierra if else
            }//cierra for
            if (paretnesis.Count == 0)
            {//si esta vacio entonces
                Console.WriteLine("ecuacion correcta");//imprime es correcta
            }
            else
            {//si no
                Console.WriteLine("no esta equilibrada");//imprime no esta equilibrada
            }//cierra else
        }
    }
}