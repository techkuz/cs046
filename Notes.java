
//reading from a file

throws FileNotFoundException
{
    File inputFile = new File("input.txt");
    Scanner in  = new Scanner (inputFile);
}

while (in.hasNextDouble())
{
    double value = in.nextDouble();
}


// Random numbers

Random generator = new Random();
int randomInteger = generator.nextInt(n);  // number between 0 and n-1

double x = generator.nextDouble(); // number between 0 and 1;


