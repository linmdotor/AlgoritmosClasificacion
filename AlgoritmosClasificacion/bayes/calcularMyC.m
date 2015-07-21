function [m, C] = calcularMyC(matr)
%
% devuelve los valores de m y C hallados por Bayes
%

  % Inicializa el resultado
  m = 0;
  C = 0;

  num_atr = size(matr,1);

  #Calcula m y C
  m = sum(matr)./num_atr;

  C=0;
  for i=1:num_atr
   C = C + ((matr(i,:).-m)') * (matr(i,:).-m) ./num_atr;
  end

end
