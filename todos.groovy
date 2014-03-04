public class Todo{
String name, note
int hours
}
               def todos=[
               new Todo(name:"Bob",note:"something", hours: 8),
               new Todo(name:"Sue",note:"a note", hours: 9),
               new Todo(name:"job one",note:"work in barn", hours: 50),
               new Todo(name:"work",note:"hours", hours: 1)]
               todos.each{
               println"${it.name}  ${it.note} ${it.hours}"
                              }