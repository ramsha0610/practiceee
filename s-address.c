#include <stdio.h>
#include <string.h>

int main() {
    char exp[20], op1, op2, op3;
    int t = 1;
    
    printf("Enter expression (e.g. a=b+c*d): ");
    scanf("%s", exp);

    op1 = exp[2];   // first operand (after '=')
    op2 = exp[4];   // second operand
    op3 = exp[3];   // operator

    // Handle multiplication first if present
    if (exp[4] == '*' || exp[4] == '/')
        printf("t%d = %c %c %c\n", t++, exp[2], exp[4], exp[5]);
    
    // Handle addition or subtraction
    if (exp[3] == '+' || exp[3] == '-')
        printf("t%d = %c %c %c\n", t++, exp[2], exp[3], exp[4]);

    printf("%c = t%d\n", exp[0], t - 1);
    return 0;
}
