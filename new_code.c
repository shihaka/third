#include <unistd.h>

void	ptchar(char c)
{
	write(1, &c, 1);
}

int	main()
{
	char a;
	a = 'a';
	while (a <= 'z')
	{
		ptchar(a);
		a++;
	}
	return (0);
}
