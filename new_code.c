#include <unistd.h>

void	ptchar(char c)
{
	write(1, &c, 1);
}

int	main()
{
	char a;
	a = 0;
	while (a <= 10)
	{
		ptchar('b');
		a++;
	}
	return (0);
}
