/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package slate;

import slate.bases.MapBase;
import slate.maps.TestMap;
import slate.parser.Command;

import static slate.parser.Commands.getInput;

public class App {

    // Define the map to use
    MapBase current_map = new TestMap();

    public static void main(String[] args) {
        new App();
    }

    App() {
        // Pint the map introduction text
        System.out.println(current_map.getDescription());

        while (true) {
           Command comm = getInput();

           //If command is valid, execute it.
           if(comm.validate()) comm.execute();
        }
    }
}
