package disparse.discord;

import disparse.parser.Command;
import disparse.parser.CommandFlag;
import java.util.Collection;

public interface Helpable<E> {

  void help(E event, Command command, Collection<CommandFlag> flags,
            Collection<Command> commands);

  void allCommands(E event, Collection<Command> commands);

  void setPrefix(String prefix);

  void commandNotFound(E event, String userInput);

  void roleNotMet(E event, Command command);

  void optionRequired(E event, String message);
}
