def wrap_text(text, width):
    lines = []
    while len(text) > width:
        pos = text[0: width + 1].rfind(' ')
        if pos > 0:
            head, text = text[0: pos], text[pos + 1:]
        else:
            head, text = text[0: width], text[width:]
        lines.append(head)
    lines.append(text)
    return '\n'.join(lines)