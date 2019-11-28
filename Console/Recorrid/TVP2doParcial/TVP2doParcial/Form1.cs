/*Gomez Ponce Erick Alonso
 4to A Ing Software */
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace TVP2doParcial
{
    public partial class Form1 : Form
    {
        //Variables
        ArrayList palabras = new ArrayList();

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {   
        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            String pal;
            pal = (txtIngreso.Text);
            palabras.Add(pal);
        }

        private void ctnCalcular_Click(object sender, EventArgs e)
        {
            Result rs = new Result(palabras);
            //rs.MdiParent = this;
            rs.Show();
            
        }
    }
}