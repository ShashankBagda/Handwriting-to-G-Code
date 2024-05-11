class EnglishFrame extends JFrame implements ActionListener {
    private boolean imageSelected = false, processed = false;
    private JButton processButton, selectButton, reorderButton, exportButton, backButton;
    private JLabel selectedImage;
    private JProgressBar progressBar;
    private JLabel 
    _A,_B,_C,_D,_E,_F,_G,_H,_I,_J,_K,_L,_M,_N,_O,_P,_Q,_R,_S,_T,_U,_V,_W,_X,_Y,_Z,
    a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,
    _full_stop, _double_InComma, _underscore, _equals, _addition, _substraction, _brac_curl_end, _brac_curl_start, _brac_square_end, _brac_square_start, _multiplication, _hashtag, _and, _percentage, _dollar, _tilde,
    _brac_round_end, _brac_round_start, _greaterthan, _lessthan, _slash, _toPower, _atharet, _question, _exclamation,
    _colon, _comma, _apostrophe, _backquote, _semicolon,
    _9, _8, _7, _6, _5, _4, _3, _2, _1, _0;

    public EnglishFrame() {
        setTitle("Process Frame");
        setLayout(new BorderLayout());
        // setResizable(false);
        // setUndecorated(true);

        // Set background image
        setContentPane(new JLabel(new ImageIcon("Graphics/english.png")));

        backButton = new JButton();
        backButton.setBorderPainted(true);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(this);
        backButton.setBounds(10, 14, 45, 40);
        add(backButton, BorderLayout.CENTER);

        // Create Select button with image
        selectButton = new JButton();
        selectButton.setBorderPainted(true);
        selectButton.setContentAreaFilled(false);
        selectButton.addActionListener(this);
        selectButton.setBounds(665, 865, 200, 110);
        add(selectButton, BorderLayout.CENTER);

        // Create Process button with image
        processButton = new JButton();
        processButton.setBorderPainted(true);
        processButton.setContentAreaFilled(false);
        processButton.addActionListener(this);
        processButton.setBounds(875, 865, 200, 110);
        add(processButton, BorderLayout.CENTER);

        reorderButton = new JButton();
        reorderButton.setBorderPainted(true);
        reorderButton.setContentAreaFilled(false);
        reorderButton.addActionListener(this);
        reorderButton.setBounds(1080, 865, 200, 110);
        add(reorderButton, BorderLayout.CENTER);

        exportButton = new JButton();
        exportButton.setBorderPainted(true);
        exportButton.setContentAreaFilled(false);
        exportButton.addActionListener(this);
        exportButton.setBounds(1705, 865, 200, 110);
        add(exportButton, BorderLayout.CENTER);

        // Create Selected Image Label
        selectedImage = new JLabel("No Image Selected");
        selectedImage.setHorizontalAlignment(JLabel.CENTER);
        selectedImage.setVerticalAlignment(JLabel.CENTER);
        selectedImage.setBounds(15, 187, 500, 762);
        selectedImage.setVisible(true);
        add(selectedImage, BorderLayout.CENTER);
        

        // Create Progress Bar
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBounds(1288, 865, 408, 110);
        add(progressBar, BorderLayout.CENTER);

        // Create Selected Image Label
        _A = new JLabel();
        _A.setHorizontalAlignment(JLabel.CENTER);
        _A.setVerticalAlignment(JLabel.CENTER);
        _A.setBounds(565, 16, 92, 110);
        _A.setVisible(true);
        add(_A, BorderLayout.CENTER);

        _B = new JLabel();
        _B.setHorizontalAlignment(JLabel.CENTER);
        _B.setVerticalAlignment(JLabel.CENTER);
        _B.setBounds(668, 16, 92, 110);
        _B.setVisible(true);
        add(_B, BorderLayout.CENTER);

        _C = new JLabel();
        _C.setHorizontalAlignment(JLabel.CENTER);
        _C.setVerticalAlignment(JLabel.CENTER);
        _C.setBounds(772, 16, 92, 110);
        _C.setVisible(true);
        add(_C, BorderLayout.CENTER);

        _D = new JLabel();
        _D.setHorizontalAlignment(JLabel.CENTER);
        _D.setVerticalAlignment(JLabel.CENTER);
        _D.setBounds(876, 16, 92, 110);
        _D.setVisible(true);
        add(_D, BorderLayout.CENTER);

        _E = new JLabel();
        _E.setHorizontalAlignment(JLabel.CENTER);
        _E.setVerticalAlignment(JLabel.CENTER);
        _E.setBounds(980, 16, 92, 110);
        _E.setVisible(true);
        add(_E, BorderLayout.CENTER);

        _F = new JLabel();
        _F.setHorizontalAlignment(JLabel.CENTER);
        _F.setVerticalAlignment(JLabel.CENTER);
        _F.setBounds(1082, 16, 92, 110);
        _F.setVisible(true);
        add(_F, BorderLayout.CENTER);

        _G = new JLabel();
        _G.setHorizontalAlignment(JLabel.CENTER);
        _G.setVerticalAlignment(JLabel.CENTER);
        _G.setBounds(1186, 16, 92, 110);
        _G.setVisible(true);
        add(_G, BorderLayout.CENTER);

        _H = new JLabel();
        _H.setHorizontalAlignment(JLabel.CENTER);
        _H.setVerticalAlignment(JLabel.CENTER);
        _H.setBounds(1290, 16, 92, 110);
        _H.setVisible(true);
        add(_H, BorderLayout.CENTER);

        _I = new JLabel();
        _I.setHorizontalAlignment(JLabel.CENTER);
        _I.setVerticalAlignment(JLabel.CENTER);
        _I.setBounds(1392, 16, 92, 110);
        _I.setVisible(true);
        add(_I, BorderLayout.CENTER);

        _J = new JLabel();
        _J.setHorizontalAlignment(JLabel.CENTER);
        _J.setVerticalAlignment(JLabel.CENTER);
        _J.setBounds(1497, 16, 92, 110);
        _J.setVisible(true);
        add(_J, BorderLayout.CENTER);

        _K = new JLabel();
        _K.setHorizontalAlignment(JLabel.CENTER);
        _K.setVerticalAlignment(JLabel.CENTER);
        _K.setBounds(1600, 16, 92, 110);
        _K.setVisible(true);
        add(_K, BorderLayout.CENTER);

        _L = new JLabel();
        _L.setHorizontalAlignment(JLabel.CENTER);
        _L.setVerticalAlignment(JLabel.CENTER);
        _L.setBounds(1704, 16, 92, 110);
        _L.setVisible(true);
        add(_L, BorderLayout.CENTER);

        _M = new JLabel();
        _M.setHorizontalAlignment(JLabel.CENTER);
        _M.setVerticalAlignment(JLabel.CENTER);
        _M.setBounds(1808, 16, 92, 110);
        _M.setVisible(true);
        add(_M, BorderLayout.CENTER);

        _N = new JLabel();
        _N.setHorizontalAlignment(JLabel.CENTER);
        _N.setVerticalAlignment(JLabel.CENTER);
        _N.setBounds(565, 136, 92, 110);
        _N.setVisible(true);
        add(_N, BorderLayout.CENTER);

        _O = new JLabel();
        _O.setHorizontalAlignment(JLabel.CENTER);
        _O.setVerticalAlignment(JLabel.CENTER);
        _O.setBounds(668, 136, 92, 110);
        _O.setVisible(true);
        add(_O, BorderLayout.CENTER);

        _P = new JLabel();
        _P.setHorizontalAlignment(JLabel.CENTER);
        _P.setVerticalAlignment(JLabel.CENTER);
        _P.setBounds(772, 136, 92, 110);
        _P.setVisible(true);
        add(_P, BorderLayout.CENTER);

        _Q = new JLabel();
        _Q.setHorizontalAlignment(JLabel.CENTER);
        _Q.setVerticalAlignment(JLabel.CENTER);
        _Q.setBounds(876, 136, 92, 110);
        _Q.setVisible(true);
        add(_Q, BorderLayout.CENTER);

        _R = new JLabel();
        _R.setHorizontalAlignment(JLabel.CENTER);
        _R.setVerticalAlignment(JLabel.CENTER);
        _R.setBounds(980, 136, 92, 110);
        _R.setVisible(true);
        add(_R, BorderLayout.CENTER);

        _S = new JLabel();
        _S.setHorizontalAlignment(JLabel.CENTER);
        _S.setVerticalAlignment(JLabel.CENTER);
        _S.setBounds(1082, 136, 92, 110);
        _S.setVisible(true);
        add(_S, BorderLayout.CENTER);

        _T = new JLabel();
        _T.setHorizontalAlignment(JLabel.CENTER);
        _T.setVerticalAlignment(JLabel.CENTER);
        _T.setBounds(1186, 136, 92, 110);
        _T.setVisible(true);
        add(_T, BorderLayout.CENTER);

        _U = new JLabel();
        _U.setHorizontalAlignment(JLabel.CENTER);
        _U.setVerticalAlignment(JLabel.CENTER);
        _U.setBounds(1290, 136, 92, 110);
        _U.setVisible(true);
        add(_U, BorderLayout.CENTER);

        _V = new JLabel();
        _V.setHorizontalAlignment(JLabel.CENTER);
        _V.setVerticalAlignment(JLabel.CENTER);
        _V.setBounds(1392, 136, 92, 110);
        _V.setVisible(true);
        add(_V, BorderLayout.CENTER);

        _W = new JLabel();
        _W.setHorizontalAlignment(JLabel.CENTER);
        _W.setVerticalAlignment(JLabel.CENTER);
        _W.setBounds(1497, 136, 92, 110);
        _W.setVisible(true);
        add(_W, BorderLayout.CENTER);

        _X = new JLabel();
        _X.setHorizontalAlignment(JLabel.CENTER);
        _X.setVerticalAlignment(JLabel.CENTER);
        _X.setBounds(1600, 136, 92, 110);
        _X.setVisible(true);
        add(_X, BorderLayout.CENTER);

        _Y = new JLabel();
        _Y.setHorizontalAlignment(JLabel.CENTER);
        _Y.setVerticalAlignment(JLabel.CENTER);
        _Y.setBounds(1704, 136, 92, 110);
        _Y.setVisible(true);
        add(_Y, BorderLayout.CENTER);

        _Z = new JLabel();
        _Z.setHorizontalAlignment(JLabel.CENTER);
        _Z.setVerticalAlignment(JLabel.CENTER);
        _Z.setBounds(1808, 136, 92, 110);
        _Z.setVisible(true);
        add(_Z, BorderLayout.CENTER);


        a = new JLabel();
        a.setHorizontalAlignment(JLabel.CENTER);
        a.setVerticalAlignment(JLabel.CENTER);
        a.setBounds(565, 258, 92, 110);
        a.setVisible(true);
        add(a, BorderLayout.CENTER);

        b = new JLabel();
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setVerticalAlignment(JLabel.CENTER);
        b.setBounds(668, 258, 92, 110);
        b.setVisible(true);
        add(b, BorderLayout.CENTER);

        c = new JLabel();
        c.setHorizontalAlignment(JLabel.CENTER);
        c.setVerticalAlignment(JLabel.CENTER);
        c.setBounds(772, 258, 92, 110);
        c.setVisible(true);
        add(c, BorderLayout.CENTER);

        d = new JLabel();
        d.setHorizontalAlignment(JLabel.CENTER);
        d.setVerticalAlignment(JLabel.CENTER);
        d.setBounds(876, 258, 92, 110);
        d.setVisible(true);
        add(d, BorderLayout.CENTER);

        e = new JLabel();
        e.setHorizontalAlignment(JLabel.CENTER);
        e.setVerticalAlignment(JLabel.CENTER);
        e.setBounds(980, 258, 92, 110);
        e.setVisible(true);
        add(e, BorderLayout.CENTER);

        f = new JLabel();
        f.setHorizontalAlignment(JLabel.CENTER);
        f.setVerticalAlignment(JLabel.CENTER);
        f.setBounds(1082, 258, 92, 110);
        f.setVisible(true);
        add(f, BorderLayout.CENTER);

        g = new JLabel();
        g.setHorizontalAlignment(JLabel.CENTER);
        g.setVerticalAlignment(JLabel.CENTER);
        g.setBounds(1186, 258, 92, 110);
        g.setVisible(true);
        add(g, BorderLayout.CENTER);

        h = new JLabel();
        h.setHorizontalAlignment(JLabel.CENTER);
        h.setVerticalAlignment(JLabel.CENTER);
        h.setBounds(1290, 258, 92, 110);
        h.setVisible(true);
        add(h, BorderLayout.CENTER);

        i = new JLabel();
        i.setHorizontalAlignment(JLabel.CENTER);
        i.setVerticalAlignment(JLabel.CENTER);
        i.setBounds(1392, 258, 92, 110);
        i.setVisible(true);
        add(i, BorderLayout.CENTER);

        j = new JLabel();
        j.setHorizontalAlignment(JLabel.CENTER);
        j.setVerticalAlignment(JLabel.CENTER);
        j.setBounds(1497, 258, 92, 110);
        j.setVisible(true);
        add(j, BorderLayout.CENTER);

        k = new JLabel();
        k.setHorizontalAlignment(JLabel.CENTER);
        k.setVerticalAlignment(JLabel.CENTER);
        k.setBounds(1600, 258, 92, 110);
        k.setVisible(true);
        add(k, BorderLayout.CENTER);

        l = new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setBounds(1704, 258, 92, 110);
        l.setVisible(true);
        add(l, BorderLayout.CENTER);

        m = new JLabel();
        m.setHorizontalAlignment(JLabel.CENTER);
        m.setVerticalAlignment(JLabel.CENTER);
        m.setBounds(1808, 258, 92, 110);
        m.setVisible(true);
        add(m, BorderLayout.CENTER);

        n = new JLabel();
        n.setHorizontalAlignment(JLabel.CENTER);
        n.setVerticalAlignment(JLabel.CENTER);
        n.setBounds(565, 380, 92, 110);
        n.setVisible(true);
        add(n, BorderLayout.CENTER);

        o = new JLabel();
        o.setHorizontalAlignment(JLabel.CENTER);
        o.setVerticalAlignment(JLabel.CENTER);
        o.setBounds(668, 380, 92, 110);
        o.setVisible(true);
        add(o, BorderLayout.CENTER);

        p = new JLabel();
        p.setHorizontalAlignment(JLabel.CENTER);
        p.setVerticalAlignment(JLabel.CENTER);
        p.setBounds(772, 380, 92, 110);
        p.setVisible(true);
        add(p, BorderLayout.CENTER);

        q = new JLabel();
        q.setHorizontalAlignment(JLabel.CENTER);
        q.setVerticalAlignment(JLabel.CENTER);
        q.setBounds(876, 380, 92, 110);
        q.setVisible(true);
        add(q, BorderLayout.CENTER);

        r = new JLabel();
        r.setHorizontalAlignment(JLabel.CENTER);
        r.setVerticalAlignment(JLabel.CENTER);
        r.setBounds(980, 380, 92, 110);
        r.setVisible(true);
        add(r, BorderLayout.CENTER);

        s = new JLabel();
        s.setHorizontalAlignment(JLabel.CENTER);
        s.setVerticalAlignment(JLabel.CENTER);
        s.setBounds(1082, 380, 92, 110);
        s.setVisible(true);
        add(s, BorderLayout.CENTER);

        t = new JLabel();
        t.setHorizontalAlignment(JLabel.CENTER);
        t.setVerticalAlignment(JLabel.CENTER);
        t.setBounds(1186, 380, 92, 110);
        t.setVisible(true);
        add(t, BorderLayout.CENTER);

        u = new JLabel();
        u.setHorizontalAlignment(JLabel.CENTER);
        u.setVerticalAlignment(JLabel.CENTER);
        u.setBounds(1290, 380, 92, 110);
        u.setVisible(true);
        add(u, BorderLayout.CENTER);

        v = new JLabel();
        v.setHorizontalAlignment(JLabel.CENTER);
        v.setVerticalAlignment(JLabel.CENTER);
        v.setBounds(1392, 380, 92, 110);
        v.setVisible(true);
        add(v, BorderLayout.CENTER);

        w = new JLabel();
        w.setHorizontalAlignment(JLabel.CENTER);
        w.setVerticalAlignment(JLabel.CENTER);
        w.setBounds(1497, 380, 92, 110);
        w.setVisible(true);
        add(w, BorderLayout.CENTER);

        x = new JLabel();
        x.setHorizontalAlignment(JLabel.CENTER);
        x.setVerticalAlignment(JLabel.CENTER);
        x.setBounds(1600, 380, 92, 110);
        x.setVisible(true);
        add(x, BorderLayout.CENTER);

        y = new JLabel();
        y.setHorizontalAlignment(JLabel.CENTER);
        y.setVerticalAlignment(JLabel.CENTER);
        y.setBounds(1704, 380, 92, 110);
        y.setVisible(true);
        add(y, BorderLayout.CENTER);

        z = new JLabel();
        z.setHorizontalAlignment(JLabel.CENTER);
        z.setVerticalAlignment(JLabel.CENTER);
        z.setBounds(1808, 380, 92, 110);
        z.setVisible(true);
        add(z, BorderLayout.CENTER);

        _0 = new JLabel();
        _0.setHorizontalAlignment(JLabel.CENTER);
        _0.setVerticalAlignment(JLabel.CENTER);
        _0.setBounds(565, 502, 92, 110);
        _0.setVisible(true);
        add(_0, BorderLayout.CENTER);

        _1 = new JLabel();
        _1.setHorizontalAlignment(JLabel.CENTER);
        _1.setVerticalAlignment(JLabel.CENTER);
        _1.setBounds(668, 502, 92, 110);
        _1.setVisible(true);
        add(_1, BorderLayout.CENTER);
        
        _2 = new JLabel();
        _2.setHorizontalAlignment(JLabel.CENTER);
        _2.setVerticalAlignment(JLabel.CENTER);
        _2.setBounds(772, 502, 92, 110);
        _2.setVisible(true);
        add(_2, BorderLayout.CENTER);
        
        _3 = new JLabel();
        _3.setHorizontalAlignment(JLabel.CENTER);
        _3.setVerticalAlignment(JLabel.CENTER);
        _3.setBounds(876, 502, 92, 110);
        _3.setVisible(true);
        add(_3, BorderLayout.CENTER);
        
        _4 = new JLabel();
        _4.setHorizontalAlignment(JLabel.CENTER);
        _4.setVerticalAlignment(JLabel.CENTER);
        _4.setBounds(980, 502, 92, 110);
        _4.setVisible(true);
        add(_4, BorderLayout.CENTER);
        
        _5 = new JLabel();
        _5.setHorizontalAlignment(JLabel.CENTER);
        _5.setVerticalAlignment(JLabel.CENTER);
        _5.setBounds(1082, 502, 92, 110);
        _5.setVisible(true);
        add(_5, BorderLayout.CENTER);
        
        _6 = new JLabel();
        _6.setHorizontalAlignment(JLabel.CENTER);
        _6.setVerticalAlignment(JLabel.CENTER);
        _6.setBounds(1186, 502, 92, 110);
        _6.setVisible(true);
        add(_6, BorderLayout.CENTER);
        
        _7 = new JLabel();
        _7.setHorizontalAlignment(JLabel.CENTER);
        _7.setVerticalAlignment(JLabel.CENTER);
        _7.setBounds(1290, 502, 92, 110);
        _7.setVisible(true);
        add(_7, BorderLayout.CENTER);
        
        _8 = new JLabel();
        _8.setHorizontalAlignment(JLabel.CENTER);
        _8.setVerticalAlignment(JLabel.CENTER);
        _8.setBounds(1392, 502, 92, 110);
        _8.setVisible(true);
        add(_8, BorderLayout.CENTER);
        
        _9 = new JLabel();
        _9.setHorizontalAlignment(JLabel.CENTER);
        _9.setVerticalAlignment(JLabel.CENTER);
        _9.setBounds(1497, 502, 92, 110);
        _9.setVisible(true);
        add(_9, BorderLayout.CENTER);
        
        _backquote = new JLabel();
        _backquote.setHorizontalAlignment(JLabel.CENTER);
        _backquote.setVerticalAlignment(JLabel.CENTER);
        _backquote.setBounds(1600, 502, 92, 110);
        _backquote.setVisible(true);
        add(_backquote, BorderLayout.CENTER);

        _tilde = new JLabel();
        _tilde.setHorizontalAlignment(JLabel.CENTER);
        _tilde.setVerticalAlignment(JLabel.CENTER);
        _tilde.setBounds(1704, 502, 92, 110);
        _tilde.setVisible(true);
        add(_tilde, BorderLayout.CENTER);

        _exclamation = new JLabel();
        _exclamation.setHorizontalAlignment(JLabel.CENTER);
        _exclamation.setVerticalAlignment(JLabel.CENTER);
        _exclamation.setBounds(1808, 502, 92, 110);
        _exclamation.setVisible(true);
        add(_exclamation, BorderLayout.CENTER);
        
        _atharet = new JLabel();
        _atharet.setHorizontalAlignment(JLabel.CENTER);
        _atharet.setVerticalAlignment(JLabel.CENTER);
        _atharet.setBounds(565, 624, 92, 110);
        _atharet.setVisible(true);
        add(_atharet, BorderLayout.CENTER);

        _hashtag = new JLabel();
        _hashtag.setHorizontalAlignment(JLabel.CENTER);
        _hashtag.setVerticalAlignment(JLabel.CENTER);
        _hashtag.setBounds(668, 624, 92, 110);
        _hashtag.setVisible(true);
        add(_hashtag, BorderLayout.CENTER);

        _dollar = new JLabel();
        _dollar.setHorizontalAlignment(JLabel.CENTER);
        _dollar.setVerticalAlignment(JLabel.CENTER);
        _dollar.setBounds(772, 624, 92, 110);
        _dollar.setVisible(true);
        add(_dollar, BorderLayout.CENTER);

        _percentage = new JLabel();
        _percentage.setHorizontalAlignment(JLabel.CENTER);
        _percentage.setVerticalAlignment(JLabel.CENTER);
        _percentage.setBounds(876, 624, 92, 110);
        _percentage.setVisible(true);
        add(_percentage, BorderLayout.CENTER);

        _toPower = new JLabel();
        _toPower.setHorizontalAlignment(JLabel.CENTER);
        _toPower.setVerticalAlignment(JLabel.CENTER);
        _toPower.setBounds(980, 624, 92, 110);
        _toPower.setVisible(true);
        add(_toPower, BorderLayout.CENTER);

        _and = new JLabel();
        _and.setHorizontalAlignment(JLabel.CENTER);
        _and.setVerticalAlignment(JLabel.CENTER);
        _and.setBounds(1082, 624, 92, 110);
        _and.setVisible(true);
        add(_and, BorderLayout.CENTER);

        _multiplication = new JLabel();
        _multiplication.setHorizontalAlignment(JLabel.CENTER);
        _multiplication.setVerticalAlignment(JLabel.CENTER);
        _multiplication.setBounds(1186, 624, 92, 110);
        _multiplication.setVisible(true);
        add(_multiplication, BorderLayout.CENTER);

        _brac_round_start = new JLabel();
        _brac_round_start.setHorizontalAlignment(JLabel.CENTER);
        _brac_round_start.setVerticalAlignment(JLabel.CENTER);
        _brac_round_start.setBounds(1290, 624, 92, 110);
        _brac_round_start.setVisible(true);
        add(_brac_round_start, BorderLayout.CENTER);

        _brac_round_end = new JLabel();
        _brac_round_end.setHorizontalAlignment(JLabel.CENTER);
        _brac_round_end.setVerticalAlignment(JLabel.CENTER);
        _brac_round_end.setBounds(1392, 624, 92, 110);
        _brac_round_end.setVisible(true);
        add(_brac_round_end, BorderLayout.CENTER);

        _brac_square_start = new JLabel();
        _brac_square_start.setHorizontalAlignment(JLabel.CENTER);
        _brac_square_start.setVerticalAlignment(JLabel.CENTER);
        _brac_square_start.setBounds(1497, 624, 92, 110);
        _brac_square_start.setVisible(true);
        add(_brac_square_start, BorderLayout.CENTER);

        _brac_square_end = new JLabel();
        _brac_square_end.setHorizontalAlignment(JLabel.CENTER);
        _brac_square_end.setVerticalAlignment(JLabel.CENTER);
        _brac_square_end.setBounds(1600, 624, 92, 110);
        _brac_square_end.setVisible(true);
        add(_brac_square_end, BorderLayout.CENTER);

        _brac_curl_start = new JLabel();
        _brac_curl_start.setHorizontalAlignment(JLabel.CENTER);
        _brac_curl_start.setVerticalAlignment(JLabel.CENTER);
        _brac_curl_start.setBounds(1704, 624, 92, 110);
        _brac_curl_start.setVisible(true);
        add(_brac_curl_start, BorderLayout.CENTER);

        _brac_curl_end = new JLabel();
        _brac_curl_end.setHorizontalAlignment(JLabel.CENTER);
        _brac_curl_end.setVerticalAlignment(JLabel.CENTER);
        _brac_curl_end.setBounds(1808, 624, 92, 110);
        _brac_curl_end.setVisible(true);
        add(_brac_curl_end, BorderLayout.CENTER);

        _substraction = new JLabel();
        _substraction.setHorizontalAlignment(JLabel.CENTER);
        _substraction.setVerticalAlignment(JLabel.CENTER);
        _substraction.setBounds(565, 746, 92, 110);
        _substraction.setVisible(true);
        add(_substraction, BorderLayout.CENTER);

        _underscore = new JLabel();
        _underscore.setHorizontalAlignment(JLabel.CENTER);
        _underscore.setVerticalAlignment(JLabel.CENTER);
        _underscore.setBounds(668, 746, 92, 110);
        _underscore.setVisible(true);
        add(_underscore, BorderLayout.CENTER);

        _semicolon = new JLabel();
        _semicolon.setHorizontalAlignment(JLabel.CENTER);
        _semicolon.setVerticalAlignment(JLabel.CENTER);
        _semicolon.setBounds(772, 746, 92, 110);
        _semicolon.setVisible(true);
        add(_semicolon, BorderLayout.CENTER);

        _colon = new JLabel();
        _colon.setHorizontalAlignment(JLabel.CENTER);
        _colon.setVerticalAlignment(JLabel.CENTER);
        _colon.setBounds(876, 746, 92, 110);
        _colon.setVisible(true);
        add(_colon, BorderLayout.CENTER);

        _apostrophe = new JLabel();
        _apostrophe.setHorizontalAlignment(JLabel.CENTER);
        _apostrophe.setVerticalAlignment(JLabel.CENTER);
        _apostrophe.setBounds(980, 746, 92, 110);
        _apostrophe.setVisible(true);
        add(_apostrophe, BorderLayout.CENTER);

        _double_InComma = new JLabel();
        _double_InComma.setHorizontalAlignment(JLabel.CENTER);
        _double_InComma.setVerticalAlignment(JLabel.CENTER);
        _double_InComma.setBounds(1082, 746, 92, 110);
        _double_InComma.setVisible(true);
        add(_double_InComma, BorderLayout.CENTER);

        _equals = new JLabel();
        _equals.setHorizontalAlignment(JLabel.CENTER);
        _equals.setVerticalAlignment(JLabel.CENTER);
        _equals.setBounds(1186, 746, 92, 110);
        _equals.setVisible(true);
        add(_equals, BorderLayout.CENTER);

        _lessthan = new JLabel();
        _lessthan.setHorizontalAlignment(JLabel.CENTER);
        _lessthan.setVerticalAlignment(JLabel.CENTER);
        _lessthan.setBounds(1290, 746, 92, 110);
        _lessthan.setVisible(true);
        add(_lessthan, BorderLayout.CENTER);

        _greaterthan = new JLabel();
        _greaterthan.setHorizontalAlignment(JLabel.CENTER);
        _greaterthan.setVerticalAlignment(JLabel.CENTER);
        _greaterthan.setBounds(1392, 746, 92, 110);
        _greaterthan.setVisible(true);
        add(_greaterthan, BorderLayout.CENTER);

        _comma = new JLabel();
        _comma.setHorizontalAlignment(JLabel.CENTER);
        _comma.setVerticalAlignment(JLabel.CENTER);
        _comma.setBounds(1497, 746, 92, 110);
        _comma.setVisible(true);
        add(_comma, BorderLayout.CENTER);

        _full_stop = new JLabel();
        _full_stop.setHorizontalAlignment(JLabel.CENTER);
        _full_stop.setVerticalAlignment(JLabel.CENTER);
        _full_stop.setBounds(1600, 746, 92, 110);
        _full_stop.setVisible(true);
        add(_full_stop, BorderLayout.CENTER);

        _slash = new JLabel();
        _slash.setHorizontalAlignment(JLabel.CENTER);
        _slash.setVerticalAlignment(JLabel.CENTER);
        _slash.setBounds(1704, 746, 92, 110);
        _slash.setVisible(true);
        add(_slash, BorderLayout.CENTER);

        _question = new JLabel();
        _question.setHorizontalAlignment(JLabel.CENTER);
        _question.setVerticalAlignment(JLabel.CENTER);
        _question.setBounds(1808, 746, 92, 110);
        _question.setVisible(true);
        add(_question, BorderLayout.CENTER);

        _addition = new JLabel();
        _addition.setHorizontalAlignment(JLabel.CENTER);
        _addition.setVerticalAlignment(JLabel.CENTER);
        _addition.setBounds(565, 868, 92, 110);
        _addition.setVisible(true);
        add(_addition, BorderLayout.CENTER);

        // Maximize the frame by default
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JLabel label = (JLabel) getContentPane();
                label.setIcon(new ImageIcon(new ImageIcon("Graphics/english.png").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectButton) {
            JFileChooser fileChooser = new JFileChooser();
            
            // Create a file filter to only allow image files
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png");
            fileChooser.setFileFilter(filter);
            
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                // Handle image selection
                imageSelected = true;
                File selectedFile = fileChooser.getSelectedFile();
                ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                // Scale the image to fit the label
                Image image = imageIcon.getImage().getScaledInstance(selectedImage.getWidth(), selectedImage.getHeight(), Image.SCALE_SMOOTH);
                selectedImage.setIcon(new ImageIcon(image));
                selectedImage.setText(""); // Clear the text
    
                try (FileWriter writer = new FileWriter("image_path.txt")) {
                    writer.write(selectedFile.getAbsolutePath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        else if (e.getSource() == processButton) 
        {
            if (imageSelected) {
                // Start the process only if an image is selected
                new ProcessTask().execute();
                processed = true;
            } else {
                // Inform the user to select an image
                JOptionPane.showMessageDialog(this, "Please select an image first.");
            }
        }
        else if (e.getSource() == backButton) 
        {
            // Main = new Main();
            // Main.setVisible(true);
            // dispose();
        }
        else if (e.getSource() == reorderButton) 
        {
            if (processed) {
                // Start the process only if an image is selected
                // executePythonScript("reorder.py");

                try {
                    // Wait for reorder.py to finish execution
                    Process p = Runtime.getRuntime().exec("python reorder.py");
                    if (!p.waitFor(5, TimeUnit.MINUTES)) { // Wait up to 5 minutes
                        System.err.println("Script execution timeout.");
                        // Handle timeout, maybe inform the user
                    }
                } catch (IOException | InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                try {
                    String imagePath = "Verified/";
                
                    String[] symbols = {
                        "_A","_B","_C","_D","_E","_F","_G","_H","_I","_J","_K","_L","_M","_N","_O","_P","_Q","_R","_S","_T","_U","_V","_W","_X","_Y","_Z",
                        "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                        "_full_stop","_double_InComma","_underscore","_equals","_addition","_substraction","_brac_curl_end","_brac_curl_start","_brac_square_end","_brac_square_start","_multiplication","_hashtag","_and","_percentage","_dollar","_tilde",
                        "_brac_round_end","_brac_round_start","_greaterthan","_lessthan","_slash","_toPower","_atharet","_question","_exclamation",
                        "_colon","_comma","_apostrophe","_backquote","_semicolon",
                        "_9","_8","_7","_6","_5","_4","_3","_2","_1","_0"
                    };
                
                    for (String symbol : symbols) {
                        String filePath = imagePath + symbol + ".png";
                        new ProcessTask().setImageIconToLabel(filePath, symbol);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                executePythonScript("mover.py");
            } 
                else {
                // Inform the user to select an image
                JOptionPane.showMessageDialog(this, "Please Process the Data.");
            }
        }
        else if (e.getSource() == exportButton) 
        {
            if (processed) {
                // Prompt user for a name
                String name = JOptionPane.showInputDialog(this, "Enter name:");

                if (name != null && !name.isEmpty()) {
                    moveFilesToFolder(name);
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name.");
                }
            } else {
                // Inform the user to process the data
                JOptionPane.showMessageDialog(this, "Please Process the Data.");
            }
        }
    }

    private void moveFilesToFolder(String name) {
        File verifiedFolder = new File("Verified");
        File[] files = verifiedFolder.listFiles();

        if (files != null) {
            File destinationFolder = new File("Data/English/" + name);
            if (!destinationFolder.exists()) {
                destinationFolder.mkdirs();
            }

            for (File file : files) {
                try {
                    File destFile = new File(destinationFolder, file.getName());
                    Files.move(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved file: " + file.getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(this, "Files moved successfully to Data/English/" + name);
        } else {
            JOptionPane.showMessageDialog(this, "No files to export.");
        }
    }

    // Background task to perform the process
    private class ProcessTask extends SwingWorker<Void, Integer> {
        @Override
        protected Void doInBackground() throws Exception {
            publish(0);
            Thread.sleep(1000);
    
            executePythonScript("extractor.py");
            publish(25);
            Thread.sleep(1000);
    
            executePythonScript("removebg.py");
            publish(50);
            Thread.sleep(1000);
    
            executePythonScript("rename.py");
            publish(75);
            Thread.sleep(1000);
    
            executePythonScript("borderRemover.py");
            publish(100);

            // Thread.sleep(1000);
            // executePythonScript("embedder.py");
            // publish(100);
    
            return null;
        }
    
        @Override
        protected void process(java.util.List<Integer> chunks) {
            // Update progress bar
            for (Integer value : chunks) {
                progressBar.setValue(value);
            }
        }
    
        @Override
        protected void done() {
            try {
                // Set images to the appropriate labels
                setImagesToLabels();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        private void setImagesToLabels() {
            try {
                String imagePath = "Output/";
            
                String[] symbols = {
                    "_A","_B","_C","_D","_E","_F","_G","_H","_I","_J","_K","_L","_M","_N","_O","_P","_Q","_R","_S","_T","_U","_V","_W","_X","_Y","_Z",
                    "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                    "_full_stop","_double_InComma","_underscore","_equals","_addition","_substraction","_brac_curl_end","_brac_curl_start","_brac_square_end","_brac_square_start","_multiplication","_hashtag","_and","_percentage","_dollar","_tilde",
                    "_brac_round_end","_brac_round_start","_greaterthan","_lessthan","_slash","_toPower","_atharet","_question","_exclamation",
                    "_colon","_comma","_apostrophe","_backquote","_semicolon",
                    "_9","_8","_7","_6","_5","_4","_3","_2","_1","_0"
                };
            
                for (String symbol : symbols) {
                    String filePath = imagePath + symbol + ".png";
                    setImageIconToLabel(filePath, symbol);
                }
            
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    
        private void setImageIconToLabel(String filePath, String labelName) {
            ImageIcon imageIcon = new ImageIcon(filePath);
            Image image = imageIcon.getImage().getScaledInstance(_A.getWidth(), _A.getHeight(), Image.SCALE_SMOOTH);
            switch (labelName) {
                case "_A":
                    _A.setIcon(new ImageIcon(image));
                    _A.setOpaque(true);
                    _A.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_B":
                    _B.setIcon(new ImageIcon(image));
                    _B.setOpaque(true);
                    _B.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_C":
                    _C.setIcon(new ImageIcon(image));
                    _C.setOpaque(true);
                    _C.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_D":
                    _D.setIcon(new ImageIcon(image));
                    _D.setOpaque(true);
                    _D.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_E":
                    _E.setIcon(new ImageIcon(image));
                    _E.setOpaque(true);
                    _E.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_F":
                    _F.setIcon(new ImageIcon(image));
                    _F.setOpaque(true);
                    _F.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_G":
                    _G.setIcon(new ImageIcon(image));
                    _G.setOpaque(true);
                    _G.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_H":
                    _H.setIcon(new ImageIcon(image));
                    _H.setOpaque(true);
                    _H.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_I":
                    _I.setIcon(new ImageIcon(image));
                    _I.setOpaque(true);
                    _I.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_J":
                    _J.setIcon(new ImageIcon(image));
                    _J.setOpaque(true);
                    _J.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_K":
                    _K.setIcon(new ImageIcon(image));
                    _K.setOpaque(true);
                    _K.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_L":
                    _L.setIcon(new ImageIcon(image));
                    _L.setOpaque(true);
                    _L.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_M":
                    _M.setIcon(new ImageIcon(image));
                    _M.setOpaque(true);
                    _M.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_N":
                    _N.setIcon(new ImageIcon(image));
                    _N.setOpaque(true);
                    _N.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_O":
                    _O.setIcon(new ImageIcon(image));
                    _O.setOpaque(true);
                    _O.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_P":
                    _P.setIcon(new ImageIcon(image));
                    _P.setOpaque(true);
                    _P.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_Q":
                    _Q.setIcon(new ImageIcon(image));
                    _Q.setOpaque(true);
                    _Q.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_R":
                    _R.setIcon(new ImageIcon(image));
                    _R.setOpaque(true);
                    _R.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_S":
                    _S.setIcon(new ImageIcon(image));
                    _S.setOpaque(true);
                    _S.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_T":
                    _T.setIcon(new ImageIcon(image));
                    _T.setOpaque(true);
                    _T.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_U":
                    _U.setIcon(new ImageIcon(image));
                    _U.setOpaque(true);
                    _U.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_V":
                    _V.setIcon(new ImageIcon(image));
                    _V.setOpaque(true);
                    _V.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_W":
                    _W.setIcon(new ImageIcon(image));
                    _W.setOpaque(true);
                    _W.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_X":
                    _X.setIcon(new ImageIcon(image));
                    _X.setOpaque(true);
                    _X.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_Y":
                    _Y.setIcon(new ImageIcon(image));
                    _Y.setOpaque(true);
                    _Y.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_Z":
                    _Z.setIcon(new ImageIcon(image));
                    _Z.setOpaque(true);
                    _Z.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "a":
                    a.setIcon(new ImageIcon(image));
                    a.setOpaque(true);
                    a.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "b":
                    b.setIcon(new ImageIcon(image));
                    b.setOpaque(true);
                    b.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "c":
                    c.setIcon(new ImageIcon(image));
                    c.setOpaque(true);
                    c.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "d":
                    d.setIcon(new ImageIcon(image));
                    d.setOpaque(true);
                    d.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "e":
                    e.setIcon(new ImageIcon(image));
                    e.setOpaque(true);
                    e.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "f":
                    f.setIcon(new ImageIcon(image));
                    f.setOpaque(true);
                    f.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "g":
                    g.setIcon(new ImageIcon(image));
                    g.setOpaque(true);
                    g.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "h":
                    h.setIcon(new ImageIcon(image));
                    h.setOpaque(true);
                    h.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "i":
                    i.setIcon(new ImageIcon(image));
                    i.setOpaque(true);
                    i.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "j":
                    j.setIcon(new ImageIcon(image));
                    j.setOpaque(true);
                    j.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "k":
                    k.setIcon(new ImageIcon(image));
                    k.setOpaque(true);
                    k.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "l":
                    l.setIcon(new ImageIcon(image));
                    l.setOpaque(true);
                    l.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "m":
                    m.setIcon(new ImageIcon(image));
                    m.setOpaque(true);
                    m.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "n":
                    n.setIcon(new ImageIcon(image));
                    n.setOpaque(true);
                    n.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "o":
                    o.setIcon(new ImageIcon(image));
                    o.setOpaque(true);
                    o.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "p":
                    p.setIcon(new ImageIcon(image));
                    p.setOpaque(true);
                    p.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "q":
                    q.setIcon(new ImageIcon(image));
                    q.setOpaque(true);
                    q.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "r":
                    r.setIcon(new ImageIcon(image));
                    r.setOpaque(true);
                    r.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "s":
                    s.setIcon(new ImageIcon(image));
                    s.setOpaque(true);
                    s.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "t":
                    t.setIcon(new ImageIcon(image));
                    t.setOpaque(true);
                    t.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "u":
                    u.setIcon(new ImageIcon(image));
                    u.setOpaque(true);
                    u.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "v":
                    v.setIcon(new ImageIcon(image));
                    v.setOpaque(true);
                    v.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "w":
                    w.setIcon(new ImageIcon(image));
                    w.setOpaque(true);
                    w.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "x":
                    x.setIcon(new ImageIcon(image));
                    x.setOpaque(true);
                    x.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "y":
                    y.setIcon(new ImageIcon(image));
                    y.setOpaque(true);
                    y.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "z":
                    z.setIcon(new ImageIcon(image));
                    z.setOpaque(true);
                    z.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_full_stop":
                    _full_stop.setIcon(new ImageIcon(image));
                    _full_stop.setOpaque(true);
                    _full_stop.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_double_InComma":
                    _double_InComma.setIcon(new ImageIcon(image));
                    _double_InComma.setOpaque(true);
                    _double_InComma.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_underscore":
                    _underscore.setIcon(new ImageIcon(image));
                    _underscore.setOpaque(true);
                    _underscore.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_equals":
                    _equals.setIcon(new ImageIcon(image));
                    _equals.setOpaque(true);
                    _equals.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_addition":
                    _addition.setIcon(new ImageIcon(image));
                    _addition.setOpaque(true);
                    _addition.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_substraction":
                    _substraction.setIcon(new ImageIcon(image));
                    _substraction.setOpaque(true);
                    _substraction.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_curl_end":
                    _brac_curl_end.setIcon(new ImageIcon(image));
                    _brac_curl_end.setOpaque(true);
                    _brac_curl_end.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_curl_start":
                    _brac_curl_start.setIcon(new ImageIcon(image));
                    _brac_curl_start.setOpaque(true);
                    _brac_curl_start.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_square_end":
                    _brac_square_end.setIcon(new ImageIcon(image));
                    _brac_square_end.setOpaque(true);
                    _brac_square_end.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_square_start":
                    _brac_square_start.setIcon(new ImageIcon(image));
                    _brac_square_start.setOpaque(true);
                    _brac_square_start.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_multiplication":
                    _multiplication.setIcon(new ImageIcon(image));
                    _multiplication.setOpaque(true);
                    _multiplication.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_hashtag":
                    _hashtag.setIcon(new ImageIcon(image));
                    _hashtag.setOpaque(true);
                    _hashtag.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_and":
                    _and.setIcon(new ImageIcon(image));
                    _and.setOpaque(true);
                    _and.setBackground(Color.decode("#D9D9D9"));
                    break;
               
                    case "_percentage":
                    _percentage.setIcon(new ImageIcon(image));
                    _percentage.setOpaque(true);
                    _percentage.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_dollar":
                    _dollar.setIcon(new ImageIcon(image));
                    _dollar.setOpaque(true);
                    _dollar.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_tilde":
                    _tilde.setIcon(new ImageIcon(image));
                    _tilde.setOpaque(true);
                    _tilde.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_round_end":
                    _brac_round_end.setIcon(new ImageIcon(image));
                    _brac_round_end.setOpaque(true);
                    _brac_round_end.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_brac_round_start":
                    _brac_round_start.setIcon(new ImageIcon(image));
                    _brac_round_start.setOpaque(true);
                    _brac_round_start.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_greaterthan":
                    _greaterthan.setIcon(new ImageIcon(image));
                    _greaterthan.setOpaque(true);
                    _greaterthan.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_lessthan":
                    _lessthan.setIcon(new ImageIcon(image));
                    _lessthan.setOpaque(true);
                    _lessthan.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_slash":
                    _slash.setIcon(new ImageIcon(image));
                    _slash.setOpaque(true);
                    _slash.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_toPower":
                    _toPower.setIcon(new ImageIcon(image));
                    _toPower.setOpaque(true);
                    _toPower.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_atharet":
                    _atharet.setIcon(new ImageIcon(image));
                    _atharet.setOpaque(true);
                    _atharet.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_question":
                    _question.setIcon(new ImageIcon(image));
                    _question.setOpaque(true);
                    _question.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_exclamation":
                    _exclamation.setIcon(new ImageIcon(image));
                    _exclamation.setOpaque(true);
                    _exclamation.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_colon":
                    _colon.setIcon(new ImageIcon(image));
                    _colon.setOpaque(true);
                    _colon.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_comma":
                    _comma.setIcon(new ImageIcon(image));
                    _comma.setOpaque(true);
                    _comma.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_apostrophe":
                    _apostrophe.setIcon(new ImageIcon(image));
                    _apostrophe.setOpaque(true);
                    _apostrophe.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_backquote":
                    _backquote.setIcon(new ImageIcon(image));
                    _backquote.setOpaque(true);
                    _backquote.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_semicolon":
                    _semicolon.setIcon(new ImageIcon(image));
                    _semicolon.setOpaque(true);
                    _semicolon.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_9":
                    _9.setIcon(new ImageIcon(image));
                    _9.setOpaque(true);
                    _9.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_8":
                    _8.setIcon(new ImageIcon(image));
                    _8.setOpaque(true);
                    _8.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_7":
                    _7.setIcon(new ImageIcon(image));
                    _7.setOpaque(true);
                    _7.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_6":
                    _6.setIcon(new ImageIcon(image));
                    _6.setOpaque(true);
                    _6.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_5":
                    _5.setIcon(new ImageIcon(image));
                    _5.setOpaque(true);
                    _5.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_4":
                    _4.setIcon(new ImageIcon(image));
                    _4.setOpaque(true);
                    _4.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_3":
                    _3.setIcon(new ImageIcon(image));
                    _3.setOpaque(true);
                    _3.setBackground(Color.decode("#D9D9D9"));break;
                case "_2":
                    _2.setIcon(new ImageIcon(image));
                    _2.setOpaque(true);
                    _2.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_1":
                    _1.setIcon(new ImageIcon(image));
                    _1.setOpaque(true);
                    _1.setBackground(Color.decode("#D9D9D9"));
                    break;
                case "_0":
                    _0.setIcon(new ImageIcon(image));
                    _0.setOpaque(true);
                    _0.setBackground(Color.decode("#D9D9D9"));
                    break;
                default:
                    // Handle the case where the symbol is not recognized
                    break;
            }
                        
        }
        
    }
    

    private void executePythonScript(String scriptName) {
        try {
            // Change directory to where the Python script is located
            String workingDirectory = System.getProperty("user.dir");
            ProcessBuilder pb = new ProcessBuilder("python", scriptName);
            pb.directory(new File(workingDirectory));
            @SuppressWarnings("unused")
            Process process = pb.start();
            // Uncomment the following line if you want to wait for the script to finish execution
            // process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}