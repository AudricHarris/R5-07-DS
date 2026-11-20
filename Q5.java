public class Q5
{
	public static void main(String[] args)
	{
		if (args.length == 0)
			throw new Error("No param passed");

		int n = Integer.parseInt(args[0]);

		if (n < 1)
			throw new Error("Erreur : N doit être supérieur ou égal à 1.");

		for (int ligne = 1; ligne <= n; ligne++)
		{
			for (int cpt = ligne; cpt > 0; cpt--)
			{
				System.out.print("x ");
			}
			System.out.println("");
		}
	}
}
