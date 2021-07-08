import java.util.LinkedList;

public class Rat extends Thread{
    String nome;
    int x;
    int y;
    static String[][] maze = {{"*","E","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"},
                              {"*","@","*","@","@","@","@","@","*","@","@","@","@","@","@","@","@","@","@","@","@","*","@","@","@","@","@","@","@","@","@","@","*"},
                              {"*","@","*","*","*","*","*","@","@","@","*","@","@","@","*","*","*","*","*","*","*","*","@","*","*","*","*","@","*","@","*","@","*"},
                              {"*","@","@","@","@","@","@","@","*","@","@","@","*","@","@","@","@","*","@","@","@","@","@","*","@","@","@","@","*","@","*","@","*"},
                              {"*","@","*","*","*","*","*","*","*","@","*","@","*","*","*","*","@","*","@","*","*","*","*","*","*","*","*","*","*","@","@","@","*"},
                              {"*","@","@","@","@","@","*","@","@","@","*","@","*","@","@","@","@","@","@","@","*","@","@","*","@","@","@","@","*","*","*","@","*"},
                              {"*","@","*","*","*","*","*","@","*","*","*","@","*","@","*","*","@","*","*","@","@","@","*","*","@","*","*","@","@","*","*","@","*"},
                              {"*","@","@","@","@","@","@","@","*","@","@","@","*","@","*","@","@","@","@","@","*","@","@","@","@","*","@","@","*","@","@","@","*"},
                              {"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","S","*","*","*","*","*"}};

    public Rat(int y, int x, String nome){
        this.x = x;
        this.y = y;
        this.nome = nome;
        start();
    }
    public void run(){
        LinkedList<Rat> path = new LinkedList<Rat>();
            Rat rato = new Rat(0, 1, nome);
        
            path.push(rato);
        
            while(true){
                int y = path.peek().y;
                int x = path.peek().x;
                maze[y][x] = "P";
        
                if(isValid(y+1, x)){
                    //baixo
                    if(maze[y+1][x] == "S"){
                        System.out.println(this.nome +" saiu do labirinto");
                        break;
                    }else if(maze[y+1][x] == "@"){
                        System.out.println(this.nome +" andou pra baixo");
                        path.push(new Rat(y+1, x, nome));
                        continue;
                    }
                }

                if(isValid(y, x-1)){
                    //esquerda
                    if(maze[y][x-1] == "S"){
                        System.out.println(this.nome +" saiu do labirinto");
                        break;
                    }else if(maze[y][x-1] == "@"){
                        System.out.println(this.nome +" andou pra esquerda");
                        path.push(new Rat(y, x-1, nome));
                        continue;
                    }
                }

                if(isValid(y, x+1)){
                //direita
                    if(maze[y][x+1] == "S"){
                        System.out.println(this.nome +" saiu do labirinto");
                        break;
                    }else if(maze[y][x+1] == "@"){
                        System.out.println(this.nome +" andou pra direita");
                        path.push(new Rat(y, x+1, nome));
                        continue;
                    }
                }

                if(isValid(y-1, x)){
                //cima
                    if(maze[y-1][x] == "S"){
                        System.out.println(this.nome +" saiu do labirinto");
                        break;
                    }else if(maze[y-1][x] == "@"){
                        System.out.println(this.nome +" andou pra cima");
                        path.push(new Rat(y-1, x, nome));
                        continue;
                    }
                path.pop();
                System.out.println(this.nome +" voltou o caminho");
                if(path.size() <= 0){
                    System.out.println(this.nome +" ficou sem saida");
                }
            }
    }
}
    public static boolean isValid(int y, int x){
        if(y < 0 || y >= maze.length || x < 0 || x >= maze[y].length){
            return false;
            }
        return true;
        }
    }