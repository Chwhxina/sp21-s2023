package gitlet;
import static gitlet.Repository.*;
/** Driver class for Gitlet, a subset of the Git version-control system.
 *  @author TODO
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND1> <OPERAND2> ... 
     */
    public static void main(String[] args) {
        // TODO: what if args is empty?
        if(args == null){
            System.out.println("Please enter a command.");
            return;
        }
        String firstArg = args[0];
        switch(firstArg) {
            case "init":
                // TODO: handle the `init` command
                new Repository();
                break;
            case "add":
                // TODO: handle the `add [filename]` command
                if(args.length < 2 || args[1] == null){
                    System.out.println("File does not exist.");
                    return;
                }
                String filename = args[1];
                Repository.add(filename);
                break;
            case "commit":
                if(args.length < 2 || args[1] == null){
                    System.out.println("Please enter a commit message.");
                    return;
                }
                String message = args[1];
                Repository.commit(message);
                break;
            case "dump":
                if(args.length < 2 || args[1] == null) {
                    System.out.println("Please enter filename");
                    return;
                }
                DumpObj.main(Repository.simpleNameToName(args[1]));
                break;
        }
    }
}
