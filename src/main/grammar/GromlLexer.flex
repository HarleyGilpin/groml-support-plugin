package com.github.harleygilpin.gromlsupportplugin.lexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
import static com.github.harleygilpin.gromlsupportplugin.psi.GromlTypes.*;


%%

%public
%class GromlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%ignorecase

EOL=\r|\n|\r\n
WHITESPACE=[ \t]+
GROML_COMMENT=\#.*
KEY_CHAR=[A-Za-z0-9_.-]
KEY={KEY_CHAR}+
NUMBER=[+-]?[0-9_]+(\.[0-9_]+)?
STRING_DOUBLE = \"([^\"\\]|\\.)*\"
STRING_SINGLE = \'([^\'\\]|\\.)*\'

EQUALS=\=
LBRACKET=\[
RBRACKET=\]
LBRACE=\{
RBRACE=\}
COMMA=,
DOT=\.

%%

{WHITESPACE}          { return TokenType.WHITE_SPACE; }
{GROML_COMMENT}       { return GROML_COMMENT; }

{EQUALS}              { return EQUALS; }
{LBRACKET}            { return LBRACKET; }
{RBRACKET}            { return RBRACKET; }
{LBRACE}              { return LBRACE; }
{RBRACE}              { return RBRACE; }
{COMMA}               { return COMMA; }
{DOT}                 { return DOT; }

{STRING_DOUBLE}       { return STRING; }
{STRING_SINGLE}       { return STRING; }
{NUMBER}              { return NUMBER; }
{KEY}                 { return KEY; }

{EOL}                 { return TokenType.WHITE_SPACE; }

.                     { return TokenType.BAD_CHARACTER; }
