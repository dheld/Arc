package io.anuke.arc.backends.lwjgl3;

import io.anuke.arc.input.KeyCode;

import static org.lwjgl.glfw.GLFW.*;

public class Lwjgl3InputMap{
    static KeyCode toGdxButton(int button){
        if(button == 0) return KeyCode.MOUSE_LEFT;
        if(button == 1) return KeyCode.MOUSE_RIGHT;
        if(button == 2) return KeyCode.MOUSE_MIDDLE;
        if(button == 3) return KeyCode.MOUSE_BACK;
        if(button == 4) return KeyCode.MOUSE_FORWARD;
        return null;
    }

    static char characterForKeyCode(KeyCode key){
        // Map certain key codes to character codes.
        switch(key){
            case BACKSPACE:
                return 8;
            case TAB:
                return '\t';
            case FORWARD_DEL:
                return 127;
            case ENTER:
                return '\n';
        }
        return 0;
    }

    static KeyCode getGdxKeyCode(int lwjglKeyCode){
        switch(lwjglKeyCode){
            case GLFW_KEY_SPACE:
                return KeyCode.SPACE;
            case GLFW_KEY_APOSTROPHE:
                return KeyCode.APOSTROPHE;
            case GLFW_KEY_COMMA:
                return KeyCode.COMMA;
            case GLFW_KEY_MINUS:
                return KeyCode.MINUS;
            case GLFW_KEY_PERIOD:
                return KeyCode.PERIOD;
            case GLFW_KEY_SLASH:
                return KeyCode.SLASH;
            case GLFW_KEY_0:
                return KeyCode.NUM_0;
            case GLFW_KEY_1:
                return KeyCode.NUM_1;
            case GLFW_KEY_2:
                return KeyCode.NUM_2;
            case GLFW_KEY_3:
                return KeyCode.NUM_3;
            case GLFW_KEY_4:
                return KeyCode.NUM_4;
            case GLFW_KEY_5:
                return KeyCode.NUM_5;
            case GLFW_KEY_6:
                return KeyCode.NUM_6;
            case GLFW_KEY_7:
                return KeyCode.NUM_7;
            case GLFW_KEY_8:
                return KeyCode.NUM_8;
            case GLFW_KEY_9:
                return KeyCode.NUM_9;
            case GLFW_KEY_SEMICOLON:
                return KeyCode.SEMICOLON;
            case GLFW_KEY_EQUAL:
                return KeyCode.EQUALS;
            case GLFW_KEY_A:
                return KeyCode.A;
            case GLFW_KEY_B:
                return KeyCode.B;
            case GLFW_KEY_C:
                return KeyCode.C;
            case GLFW_KEY_D:
                return KeyCode.D;
            case GLFW_KEY_E:
                return KeyCode.E;
            case GLFW_KEY_F:
                return KeyCode.F;
            case GLFW_KEY_G:
                return KeyCode.G;
            case GLFW_KEY_H:
                return KeyCode.H;
            case GLFW_KEY_I:
                return KeyCode.I;
            case GLFW_KEY_J:
                return KeyCode.J;
            case GLFW_KEY_K:
                return KeyCode.K;
            case GLFW_KEY_L:
                return KeyCode.L;
            case GLFW_KEY_M:
                return KeyCode.M;
            case GLFW_KEY_N:
                return KeyCode.N;
            case GLFW_KEY_O:
                return KeyCode.O;
            case GLFW_KEY_P:
                return KeyCode.P;
            case GLFW_KEY_Q:
                return KeyCode.Q;
            case GLFW_KEY_R:
                return KeyCode.R;
            case GLFW_KEY_S:
                return KeyCode.S;
            case GLFW_KEY_T:
                return KeyCode.T;
            case GLFW_KEY_U:
                return KeyCode.U;
            case GLFW_KEY_V:
                return KeyCode.V;
            case GLFW_KEY_W:
                return KeyCode.W;
            case GLFW_KEY_X:
                return KeyCode.X;
            case GLFW_KEY_Y:
                return KeyCode.Y;
            case GLFW_KEY_Z:
                return KeyCode.Z;
            case GLFW_KEY_LEFT_BRACKET:
                return KeyCode.LEFT_BRACKET;
            case GLFW_KEY_BACKSLASH:
                return KeyCode.BACKSLASH;
            case GLFW_KEY_RIGHT_BRACKET:
                return KeyCode.RIGHT_BRACKET;
            case GLFW_KEY_GRAVE_ACCENT:
                return KeyCode.BACKTICK;
            case GLFW_KEY_WORLD_1:
            case GLFW_KEY_WORLD_2:
                return KeyCode.UNKNOWN;
            case GLFW_KEY_ESCAPE:
                return KeyCode.ESCAPE;
            case GLFW_KEY_ENTER:
                return KeyCode.ENTER;
            case GLFW_KEY_TAB:
                return KeyCode.TAB;
            case GLFW_KEY_BACKSPACE:
                return KeyCode.BACKSPACE;
            case GLFW_KEY_INSERT:
                return KeyCode.INSERT;
            case GLFW_KEY_DELETE:
                return KeyCode.FORWARD_DEL;
            case GLFW_KEY_RIGHT:
                return KeyCode.RIGHT;
            case GLFW_KEY_LEFT:
                return KeyCode.LEFT;
            case GLFW_KEY_DOWN:
                return KeyCode.DOWN;
            case GLFW_KEY_UP:
                return KeyCode.UP;
            case GLFW_KEY_PAGE_UP:
                return KeyCode.PAGE_UP;
            case GLFW_KEY_PAGE_DOWN:
                return KeyCode.PAGE_DOWN;
            case GLFW_KEY_HOME:
                return KeyCode.HOME;
            case GLFW_KEY_END:
                return KeyCode.END;
            case GLFW_KEY_CAPS_LOCK:
            case GLFW_KEY_SCROLL_LOCK:
            case GLFW_KEY_NUM_LOCK:
            case GLFW_KEY_PRINT_SCREEN:
            case GLFW_KEY_PAUSE:
                return KeyCode.UNKNOWN;
            case GLFW_KEY_F1:
                return KeyCode.F1;
            case GLFW_KEY_F2:
                return KeyCode.F2;
            case GLFW_KEY_F3:
                return KeyCode.F3;
            case GLFW_KEY_F4:
                return KeyCode.F4;
            case GLFW_KEY_F5:
                return KeyCode.F5;
            case GLFW_KEY_F6:
                return KeyCode.F6;
            case GLFW_KEY_F7:
                return KeyCode.F7;
            case GLFW_KEY_F8:
                return KeyCode.F8;
            case GLFW_KEY_F9:
                return KeyCode.F9;
            case GLFW_KEY_F10:
                return KeyCode.F10;
            case GLFW_KEY_F11:
                return KeyCode.F11;
            case GLFW_KEY_F12:
                return KeyCode.F12;
            case GLFW_KEY_F13:
            case GLFW_KEY_F14:
            case GLFW_KEY_F15:
            case GLFW_KEY_F16:
            case GLFW_KEY_F17:
            case GLFW_KEY_F18:
            case GLFW_KEY_F19:
            case GLFW_KEY_F20:
            case GLFW_KEY_F21:
            case GLFW_KEY_F22:
            case GLFW_KEY_F23:
            case GLFW_KEY_F24:
            case GLFW_KEY_F25:
                return KeyCode.UNKNOWN;
            case GLFW_KEY_KP_0:
                return KeyCode.NUMPAD_0;
            case GLFW_KEY_KP_1:
                return KeyCode.NUMPAD_1;
            case GLFW_KEY_KP_2:
                return KeyCode.NUMPAD_2;
            case GLFW_KEY_KP_3:
                return KeyCode.NUMPAD_3;
            case GLFW_KEY_KP_4:
                return KeyCode.NUMPAD_4;
            case GLFW_KEY_KP_5:
                return KeyCode.NUMPAD_5;
            case GLFW_KEY_KP_6:
                return KeyCode.NUMPAD_6;
            case GLFW_KEY_KP_7:
                return KeyCode.NUMPAD_7;
            case GLFW_KEY_KP_8:
                return KeyCode.NUMPAD_8;
            case GLFW_KEY_KP_9:
                return KeyCode.NUMPAD_9;
            case GLFW_KEY_KP_DECIMAL:
                return KeyCode.PERIOD;
            case GLFW_KEY_KP_DIVIDE:
                return KeyCode.SLASH;
            case GLFW_KEY_KP_MULTIPLY:
                return KeyCode.STAR;
            case GLFW_KEY_KP_SUBTRACT:
                return KeyCode.MINUS;
            case GLFW_KEY_KP_ADD:
                return KeyCode.PLUS;
            case GLFW_KEY_KP_ENTER:
                return KeyCode.ENTER;
            case GLFW_KEY_KP_EQUAL:
                return KeyCode.EQUALS;
            case GLFW_KEY_LEFT_SHIFT:
                return KeyCode.SHIFT_LEFT;
            case GLFW_KEY_LEFT_CONTROL:
                return KeyCode.CONTROL_LEFT;
            case GLFW_KEY_LEFT_ALT:
                return KeyCode.ALT_LEFT;
            case GLFW_KEY_RIGHT_SUPER:
            case GLFW_KEY_LEFT_SUPER:
                return KeyCode.SYM;
            case GLFW_KEY_RIGHT_SHIFT:
                return KeyCode.SHIFT_RIGHT;
            case GLFW_KEY_RIGHT_CONTROL:
                return KeyCode.CONTROL_RIGHT;
            case GLFW_KEY_RIGHT_ALT:
                return KeyCode.ALT_RIGHT;
            case GLFW_KEY_MENU:
                return KeyCode.MENU;
            default:
                return KeyCode.UNKNOWN;
        }
    }

    static int getGlfwKeyCode(KeyCode gdxKeyCode){
        switch(gdxKeyCode){
            case SPACE:
                return GLFW_KEY_SPACE;
            case APOSTROPHE:
                return GLFW_KEY_APOSTROPHE;
            case COMMA:
                return GLFW_KEY_COMMA;
            case PERIOD:
                return GLFW_KEY_PERIOD;
            case NUM_0:
                return GLFW_KEY_0;
            case NUM_1:
                return GLFW_KEY_1;
            case NUM_2:
                return GLFW_KEY_2;
            case NUM_3:
                return GLFW_KEY_3;
            case NUM_4:
                return GLFW_KEY_4;
            case NUM_5:
                return GLFW_KEY_5;
            case NUM_6:
                return GLFW_KEY_6;
            case NUM_7:
                return GLFW_KEY_7;
            case NUM_8:
                return GLFW_KEY_8;
            case NUM_9:
                return GLFW_KEY_9;
            case SEMICOLON:
                return GLFW_KEY_SEMICOLON;
            case EQUALS:
                return GLFW_KEY_EQUAL;
            case A:
                return GLFW_KEY_A;
            case B:
                return GLFW_KEY_B;
            case C:
                return GLFW_KEY_C;
            case D:
                return GLFW_KEY_D;
            case E:
                return GLFW_KEY_E;
            case F:
                return GLFW_KEY_F;
            case G:
                return GLFW_KEY_G;
            case H:
                return GLFW_KEY_H;
            case I:
                return GLFW_KEY_I;
            case J:
                return GLFW_KEY_J;
            case K:
                return GLFW_KEY_K;
            case L:
                return GLFW_KEY_L;
            case M:
                return GLFW_KEY_M;
            case N:
                return GLFW_KEY_N;
            case O:
                return GLFW_KEY_O;
            case P:
                return GLFW_KEY_P;
            case Q:
                return GLFW_KEY_Q;
            case R:
                return GLFW_KEY_R;
            case S:
                return GLFW_KEY_S;
            case T:
                return GLFW_KEY_T;
            case U:
                return GLFW_KEY_U;
            case V:
                return GLFW_KEY_V;
            case W:
                return GLFW_KEY_W;
            case X:
                return GLFW_KEY_X;
            case Y:
                return GLFW_KEY_Y;
            case Z:
                return GLFW_KEY_Z;
            case LEFT_BRACKET:
                return GLFW_KEY_LEFT_BRACKET;
            case BACKSLASH:
                return GLFW_KEY_BACKSLASH;
            case RIGHT_BRACKET:
                return GLFW_KEY_RIGHT_BRACKET;
            case BACKTICK:
                return GLFW_KEY_GRAVE_ACCENT;
            case ESCAPE:
                return GLFW_KEY_ESCAPE;
            case ENTER:
                return GLFW_KEY_ENTER;
            case TAB:
                return GLFW_KEY_TAB;
            case BACKSPACE:
                return GLFW_KEY_BACKSPACE;
            case INSERT:
                return GLFW_KEY_INSERT;
            case FORWARD_DEL:
                return GLFW_KEY_DELETE;
            case RIGHT:
                return GLFW_KEY_RIGHT;
            case LEFT:
                return GLFW_KEY_LEFT;
            case DOWN:
                return GLFW_KEY_DOWN;
            case UP:
                return GLFW_KEY_UP;
            case PAGE_UP:
                return GLFW_KEY_PAGE_UP;
            case PAGE_DOWN:
                return GLFW_KEY_PAGE_DOWN;
            case HOME:
                return GLFW_KEY_HOME;
            case END:
                return GLFW_KEY_END;
            case F1:
                return GLFW_KEY_F1;
            case F2:
                return GLFW_KEY_F2;
            case F3:
                return GLFW_KEY_F3;
            case F4:
                return GLFW_KEY_F4;
            case F5:
                return GLFW_KEY_F5;
            case F6:
                return GLFW_KEY_F6;
            case F7:
                return GLFW_KEY_F7;
            case F8:
                return GLFW_KEY_F8;
            case F9:
                return GLFW_KEY_F9;
            case F10:
                return GLFW_KEY_F10;
            case F11:
                return GLFW_KEY_F11;
            case F12:
                return GLFW_KEY_F12;
            case NUMPAD_0:
                return GLFW_KEY_KP_0;
            case NUMPAD_1:
                return GLFW_KEY_KP_1;
            case NUMPAD_2:
                return GLFW_KEY_KP_2;
            case NUMPAD_3:
                return GLFW_KEY_KP_3;
            case NUMPAD_4:
                return GLFW_KEY_KP_4;
            case NUMPAD_5:
                return GLFW_KEY_KP_5;
            case NUMPAD_6:
                return GLFW_KEY_KP_6;
            case NUMPAD_7:
                return GLFW_KEY_KP_7;
            case NUMPAD_8:
                return GLFW_KEY_KP_8;
            case NUMPAD_9:
                return GLFW_KEY_KP_9;
            case SLASH:
                return GLFW_KEY_KP_DIVIDE;
            case STAR:
                return GLFW_KEY_KP_MULTIPLY;
            case MINUS:
                return GLFW_KEY_KP_SUBTRACT;
            case PLUS:
                return GLFW_KEY_KP_ADD;
            case SHIFT_LEFT:
                return GLFW_KEY_LEFT_SHIFT;
            case CONTROL_LEFT:
                return GLFW_KEY_LEFT_CONTROL;
            case ALT_LEFT:
                return GLFW_KEY_LEFT_ALT;
            case SYM:
                return GLFW_KEY_LEFT_SUPER;
            case SHIFT_RIGHT:
                return GLFW_KEY_RIGHT_SHIFT;
            case CONTROL_RIGHT:
                return GLFW_KEY_RIGHT_CONTROL;
            case ALT_RIGHT:
                return GLFW_KEY_RIGHT_ALT;
            case MENU:
                return GLFW_KEY_MENU;
            default:
                return 0;
        }
    }
}
