##
## Bayes.
##

clear all;

datos = readFile("Iris2Clases.txt");

matr = procesarDatos(datos);
X = matr(:,1:(size(matr,2)-1))
y = matr(:,size(matr,2))


#X=[[50,250,200];[10,254,180];[20,240,210];[40,248,190];[56,254,202]]
#X_t=X';

num_atr = size(X,1);


#Calcula m y C
m = sum(X)./num_atr

C=0;
for i=1:num_atr
	C = C + ((X(i,:).-m)') * (X(i,:).-m) ./num_atr;
end

C


#funci�n a estimar por m�xima verosimilitud
# f(xi, w) = p(xi/m, C)   -->  w = {m, C}

#funcion(i) = 1 / ( (2*pi)^(d/2) * det(C)^0.5 ) * exp (  -1/2 * ( X(:,i) - m(i) )' * inv(C) *  ( X(:,i) - m(i) ) )