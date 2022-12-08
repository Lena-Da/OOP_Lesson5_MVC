package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.NewRepository;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation newFileOp = new FileOperationImpl("newUsers.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Repository newRepository = new NewRepository(newFileOp);
        UserController controller = new UserController(repository);
        UserController controller2 = new UserController(newRepository);
        /*ViewUser view = new ViewUser(controller);*/
        ViewUser view2 = new ViewUser(controller2);
        /*view.run();*/
        view2.run();
    }
}

