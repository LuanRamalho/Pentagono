import java.awt.*;
import javax.swing.*;


public class Pentágono extends JPanel {
        
    public Pentágono() 
    {        
        super.setPreferredSize( new Dimension( 800, 800 ) ); 
        super.setBackground( Color.BLUE );
    }
    
    public void paintComponent( Graphics g ) {
        super.paintComponent(g); 
        int larguraTela = 350;
        int alturaTela = 280;
        
        int centroX = larguraTela / 1;
        int centroY = alturaTela  / 1;
        
        int raio = 300;
        double angulo = Math.PI / 4d;
                
        int[] vetorX = new int[ 5 ];
        int[] vetorY = new int[ 5 ];
        
        for( int i = 0; i < 5; i++ ) {
            double a = angulo * i;
            
            vetorX[i] = centroX + (int)Math.round( raio * Math.cos( a ) );
            vetorY[i] = centroY + (int)Math.round( raio * Math.sin( a ) );
            
        }        
        g.setColor(Color.ORANGE);
        g.fillPolygon(vetorX, vetorY, 5);
        
        
        
    }
           
    public static void main(String[] args) {
        Pentágono painel = new Pentágono();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Pentágono" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 1000, 768 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}