package de.muenchen.allg.itd51.wollmux.core.parser.scanner;

/**
 * Tokens a generated by the scanner to build an internal representation of the
 * input stream.
 *
 * @author Daniel Sikeler
 */
public class Token
{

  /** The content of a token. */
  private final String content;
  /** The type of a token. */
  private final TokenType type;

  /**
   * Constructor for tokens.
   *
   * @param content
   *          The content of this token.
   * @param type
   *          The type of this token.
   */
  public Token(final String content, final TokenType type)
  {
    this.content = content;
    this.type = type;
  }

  /**
   * Get the content of this Token.
   *
   * @return A String Representing to content (The same as in the input file).
   */
  public String getContent()
  {
    return content;
  }

  /**
   * The Type of this token.
   *
   * @return The TokenType of this token.
   */
  public TokenType getType()
  {
    return type;
  }

  @Override
  public String toString()
  {
    return type + ": " + content;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((content == null) ? 0 : content.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(final Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    final Token other = (Token) obj;
    if (type != other.type)
    {
      return false;
    }
    if ((content == null && other.content != null)
        || (content != null && !content.equals(other.content)))
    {
      return false;
    }
    return true;
  }

}
