
package TodoApp.main;

import controller.ProjectController;
import java.time.Instant;
import java.util.Date;
import model.Project;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException {
       ProjectController projectController = new ProjectController();
       Project project = new Project();
       project.setName("Projeto teste");
       project.setDescription("Teste");
       project.setCreatedAt(Date.from(Instant.now()));
       project.setUpdatedAt(Date.from(Instant.now()));
       projectController.save(project);
      
    }
    
}
