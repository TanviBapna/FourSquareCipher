# Four-Square Cipher
## INTRODUCTION
####The Four-square cipher encrypts pairs of letters (like playfair), which makes it significantly stronger than substitution ciphers etc. since frequency analysis becomes much more difficult.
####Felix Delastelle (1840 - 1902) invented the four-square cipher, first published in a book in 1902. Delastelle was most famous for his invention of several systems of polygraphic substitution ciphers including bifid, trifid, and the four-square cipher.

##THE ALGORITHM
The four-square cipher uses four 5 by 5 matrices arranged in a square. Each of the 5 by 5 matrices contains 25 letters, usually the letter 'j' is merged with 'i' (wikipedia says 'q' is omitted, it is not very important since both q and j are rather rare letters). In general, the upper-left and lower-right matrices are the "plaintext squares" and each contain a standard alphabet. The upper-right and lower-left squares are the "ciphertext squares" and contain a mixed alphabetic sequence.
The ciphertext squares can be generated using a keyword (dropping duplicate letters), then fill the remaining spaces with the remaining letters of the alphabet in order. Alternatively the ciphertext squares can be generated completely randomly. The four-square algorithm allows for two separate keys, one for each of the two ciphertext matrices.
Steps
1. Break up the plaintext into bigrams i.e. ATTACK AT DAWN --> AT TA CK AT DA WN<br />
An 'X' (or some other character) may have to be appended to ensure theplaintext is an even length.
2. Using the four 'squares', two plain alphabet squares and two cipher alphabet squares, locate the bigram to encrypt in the plain alphabet squares. The example below enciphers the bigram 'AT'. The first letter is located from the top left square, the second letter is located in the bottom right square.<br />
&nbsp;&nbsp;&nbsp;&nbsp;a b c d e&nbsp;&nbsp;   E X A M P<br />
&nbsp;&nbsp;&nbsp;&nbsp;f g h i j&nbsp;&nbsp;   L B C D F<br />
&nbsp;&nbsp;&nbsp;&nbsp;k l m n o&nbsp;&nbsp;   G H I J K<br />
&nbsp;&nbsp;&nbsp;&nbsp;p r s t u&nbsp;&nbsp;   N O R S T<br />
&nbsp;&nbsp;&nbsp;&nbsp;v w x y z&nbsp;&nbsp;   U V W Y Z<br />
&nbsp;&nbsp;&nbsp;&nbsp;K E Y W O&nbsp;&nbsp;   a b c d e<br />
&nbsp;&nbsp;&nbsp;&nbsp;R D A B C&nbsp;&nbsp;   f g h i j<br />
&nbsp;&nbsp;&nbsp;&nbsp;F G H I J&nbsp;&nbsp;   k l m n o<br />
&nbsp;&nbsp;&nbsp;&nbsp;L M N P S&nbsp;&nbsp;   p r s t u<br />
&nbsp;&nbsp;&nbsp;&nbsp;T U V X Z&nbsp;&nbsp;   v w x y z<br />
3. Locate the characters in the ciphertext at the corners of the rectangle that the letters 'AT' make:<br />
&nbsp;&nbsp;&nbsp;&nbsp;a b c d e&nbsp;&nbsp;   E X A M P<br />
&nbsp;&nbsp;&nbsp;&nbsp;f g h i j&nbsp;&nbsp;   L B C D F<br />
&nbsp;&nbsp;&nbsp;&nbsp;k l m n o&nbsp;&nbsp;   G H I J K<br />
&nbsp;&nbsp;&nbsp;&nbsp;p r s t u&nbsp;&nbsp;   N O R S T<br />
&nbsp;&nbsp;&nbsp;&nbsp;v w x y z&nbsp;&nbsp;   U V W Y Z<br />
&nbsp;&nbsp;&nbsp;&nbsp;K E Y W O&nbsp;&nbsp;   a b c d e<br />
&nbsp;&nbsp;&nbsp;&nbsp;R D A B C&nbsp;&nbsp;   f g h i j<br />
&nbsp;&nbsp;&nbsp;&nbsp;F G H I J&nbsp;&nbsp;   k l m n o<br />
&nbsp;&nbsp;&nbsp;&nbsp;L M N P S&nbsp;&nbsp;   p r s t u<br />
&nbsp;&nbsp;&nbsp;&nbsp;T U V X Z&nbsp;&nbsp;   v w x y z<br />
4. Using the above keys, the bigram 'AT' is encrypted to 'ML'. 
The text 'attackatdawn', with the keys 'example' and 'keyword', becomes mmowpammewwg
