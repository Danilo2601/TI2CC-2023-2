package app;

import static spark.Spark.*;
import service.JogoService;


public class Main {
	
	private static JogoService JogoService = new JogoService();
	
    public static void main(String[] args) {
        port(4567);
        
        staticFiles.location("/public");
        
        post("/jogo/insert", (request, response) -> JogoService.insert(request, response));

        get("/jogo/:id", (request, response) -> JogoService.get(request, response));
        
        get("/jogo/list/:orderby", (request, response) -> JogoService.getAll(request, response));

        get("/jogo/update/:id", (request, response) -> JogoService.getToUpdate(request, response));
        
        post("/jogo/update/:id", (request, response) -> JogoService.update(request, response));
           
        get("/jogo/delete/:id", (request, response) -> JogoService.delete(request, response));

             
    }
}