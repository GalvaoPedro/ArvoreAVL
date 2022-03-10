import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreAVLTest {

	@Test
    public void testaLLRaiz()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(3);
        a.inserir(2);
        a.inserir(1);
        No aux = a.search(2);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 1 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 3 );
        assertTrue( a.ehRaiz(2) );

    }

    @Test
    public void testaLLMeio()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(10);
        a.inserir(20);
        a.inserir(5);
        a.inserir(4);
        a.inserir(7);
        a.inserir(30);
        a.inserir(15);
        a.inserir(2);
        a.inserir(1);
        No aux = a.search(2);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 1 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 4 );

    }

    @Test
    public void testaRR2Raiz()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(3);
        No aux = a.search(2);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 1 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 3 );
        assertTrue( a.ehRaiz(2) );

    }

    @Test
    public void testaRRMeio()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(50);
        a.inserir(10);
        a.inserir(60);
        a.inserir(20);
        a.inserir(5);
        a.inserir(70);
        a.inserir(40);
        a.inserir(80);
        a.inserir(90);
        No aux = a.search(80);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 70 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 90 );

    }

    @Test
    public void testaLRMeio()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(10);
        a.inserir(20);
        a.inserir(5);
        a.inserir(4);
        a.inserir(7);
        a.inserir(30);
        a.inserir(15);
        a.inserir(2);
        a.inserir(3);
        No aux = a.search(3);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 2 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 4 );

    }

    @Test
    public void testaRLMeio()
    {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(50);
        a.inserir(10);
        a.inserir(60);
        a.inserir(20);
        a.inserir(5);
        a.inserir(70);
        a.inserir(40);
        a.inserir(80);
        a.inserir(75);
        No aux = a.search(75);
        assertTrue( aux != null );
        No auxDir = aux.getDireita();
        No auxEsq = aux.getEsquerda();
        assertTrue( auxEsq != null );
        assertTrue( auxEsq.getChave() == 70 );
        assertTrue( auxDir != null );
        assertTrue( auxDir.getChave() == 80 );
    }
	

}
