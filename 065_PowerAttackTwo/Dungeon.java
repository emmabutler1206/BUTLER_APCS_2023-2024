public class Dungeon
{
    //Instance variables, calls methods from both the monster nd hero classes.
    public static void main(String[] args)
    {
    Hero sunDown = new Hero("Sun Down ", 35.0, 4.0 , 10, "light magic");   
    sunDown.Attack(30);
    sunDown.Cheer(10);

    Monster devil = new Monster("The Devil", 25.0, 0.0,10, "dark magic ");
    devil.monsterCheer();
    }
 
}

/*

1/3 - Compile/Content
-Solid 3. We talked about it.
1/1 - Formatting
1/1 - Comments

*/