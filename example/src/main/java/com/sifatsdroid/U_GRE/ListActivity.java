package com.sifatsdroid.U_GRE;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;

import java.util.ArrayList;

import android.content.Context;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends Activity {


    ListView lv;
    Context context;

    ArrayList prgmName;


    public String[] A_words = {
            "Abate",
            "To reduce in amount, degree, or severity",
            "Abscond",
            "To leave secretly",
            "Abstain",
            "To choose not to do something",
            "Abyss",
            "An extremely deep hole",
            "Adulterate",
            "To make impure",
            "Advocate",
            "To speak in favor of",
            "Aesthetic",
            "Concerning the appreciation of beauty",
            "Aggrandize",
            "To increase in power, influence, and reputation",
            "Alleviate",
            "To make more bearable",
            "Amalgamate",
            "To combine, mix together",
            "Ambiguous",
            "Doubtful or uncertain; able to be interpreted in many ways",
            "Ameliorate",
            "To make better; to improve",
            "Anachronism",
            "Something out of place in time"
    };
    public String[] B_words = {
            "Banal", "Predictable, cliched, boring",
            "Blight",
            "Any plant disease resulting in withering without rotting",


            "Bolster", "To support; to prop up",
            "Bombastic", "Pompous in speech and manner",
            "Burnish",
            "Polish and make shiny"};

    public String[] C_words = {
            "Cacophony", "Harsh, jarring noise",
            "Candid", "Impartial and honest in speech",
            "Capricious", "Changing one's mind quickly and often",
            "Castigate", "To punish or criticize harshly",
            "Catalyst", "Something that brings about a change in something else",
            "Caustic", "Biting in wit",
            "Chaos", "Great disorder and confusion",
            "Chauvinist", "Someone prejudiced in favor of a group to which he or she ",
            "Chicanery", "Deception by means of craft or guile",
            "Cogent", "Convincing and well reasoned",
            "Condone", "To overlook, pardon, or disregard",
            "Convoluted", "Intricate and complicated",
            "Corroborate", "To provide supporting evidence",
            "Credulous", "Too trusting, gullible",
            "Crescendo", "Steadily increasing volume, or force"};


    public String[] D_words = {
            "Decorum", "Appropriateness of behavior or conduct, propriety",
            "Deference", "Respect, courtesy",
            "Deride", "To speak of or treat with contempt;to mock",
            "Desiccate", "To dry out thoroughly",
            "Desultory", "Jumping from one thing to another, disconnected",
            "Diatribe", "An abusive, condemnatory speech",
            "Diffident", "Lacking self-confidence",
            "Dilate", "To make large, to expand",
            "Dilatory", "Intended to delay",
            "Dilettante", "Someone who has amateurish and superficial interest in a topic",
            "Dirge", "A funeral hymn or mournful speech",
            "Disabuse", "To set right, to free from error",
            "Discern", "To perceive, to recognize",
            "Disparate", "Fundamentally different; entirely unlike",
            "Dissemble", "To present a false appearance; To disguise one's real intentions or character",
            "Dissonance", "A harsh and disagreeable combination; often of sounds",
            "Dogma", "A firmly held opinion, often a religious belief",
            "Dogmatic", "Dictatorial in one's opinions",
            "Dupe", "To deceive; a person who is easily deceived"};
    public String[] E_words = {
            "Eclectic", "Selecting from or made up from a variety of sources",
            "Efficacy", "Effectiveness",
            "Elegy", "A sorrowful poem or speech",
            "Eloquent", "Persuasive and moving, especially in speech",
            "Emulate", "To copy, or try to equal or excel",
            "Enervate", "To reduce in strength",
            "Engender", "To produce,cause or bring about",
            "Enigma", "A puzzle, a mystery",
            "Enumerate", "To count, list, or itemize",
            "Ephemeral", "Lasting a short time",
            "Equivocate", "To use expressions of double meaning in order to mislead",
            "Erratic", "Wandering and unpredictable",
            "Erudite", "Learned, scholarly, bookish",
            "Esoteric", "Known or understood by only a few",
            "Estimable", "Admirable",
            "Eulogy", "Speech in praise of someone",
            "Euphemism", "Use of an inoffensive word or phrase in place of a more distasteful one",
            "Exacerbate", "To make worse",
            "Exculpate", "Yo clear from blame; prove innocent",
            "Exigent", "Urgent, requiring immediate action",
            "Exonerate", "To clear of blame",
            "Explicit", "Clearly stated or shown; forthright in expression"};
    public String[] F_words = {
            "Fanatical", "Acting excessively enthusiastic; filled with extreme unquestioned devotion",
            "Fawn", "To grovel",
            "Fervid", "Intensely emotional; feverish",
            "Florid", "Excessively decorated or embellished",
            "Foment", "To arouse or incite",
            "Frugality", "A tendency to be thrifty or cheap"};
    public String[] G_words = {
            "Garrulous", "Tending to talk alot",
            "Gregarious", "Outgoing, sociable",
            "Guile", "Deceit of trickery",
            "Gullible", "Easily Deceived"};
    public String[] H_words = {

            "Hackneyed", "Unoriginal and trite",
            "Harangue", "A Loud bombastic declamation expressed with strong emotion",
            "Homogeneous", "Of a similar kind"


    };
    public String[] I_words = {

            "Iconoclast", "One who opposes established beliefs, customs, and institutions",
            "Imperturbable", "Not capable of being disturbed",
            "Impervious", "Impossible to penetrate; incapable of being affected",
            "Impetuous", "Quick to act without thinking",
            "Implacable", "Unable to be calmed down or made peaceful",
            "Inchoate", "Not fully formed, disorganized",
            "Ingenuous", "Showing innocence or childlike simplicity",
            "Inimical", "Hostile, unfriendly",
            "Innocuous", "Harmless",
            "Insipid", "Lacking interest of flavor",
            "Intransigent", "Uncompromising, refusing to be reconciled",
            "Inundate", "To overwhelm to cover with water",
            "Irascible", "Easily made angry",


    };
    public String[] J_words = {
            "Jargon",
            "Technical terminology characteristic of a particular subject",
            "Jettison",
            "Throw away, of something encumbering",
            "Jingoism",
            "Fanatical patriotism",
            "Jocular",
            "Characterized by jokes and good humor",
            "Judicious",
            "Marked by the exercise of good judgment in practical matters",
            "Juncture",
            "The shape or manner in which things come together",
    };
    public String[] K_words = {
            "Keen",
            "Intense or sharp",
            "Kindle",
            "Catch fire",
            "Kinetic",
            "Relating to the motion of material bodies and their forces",
            "Knell",
            "The sound of a bell rung slowly to announce a death",
            "Kudos",
            "An expression of approval and commendation"};
    public String[] L_words = {
            "Laconic", "Using few words",
            "Lament", "To express sorrow or grieve",
            "Laud", "To give praise, to glorify",
            "Lavish", "To give unsparingly; extremely generous or extravagant",
            "Lethargic", "Acting in an indifferent or slow, sluggish manner",
            "Loquacious", "Talkative",
            "Lucid", "clear and easily understood",
            "Luminous", "Bright, brilliant, glowing",};
    public String[] M_words = {
            "Malinger", "To evade responsibility by pretending to be ill",
            "Malleable", "Capable of being shaped",
            "Metaphor", "a figure of speech comparing two different things; a symbol",
            "Meticulous", "Extremely careful about details",
            "Misanthrope", "a person who dislikes others",
            "Mitigate", "To soften, or lessen",
            "Mollify", "to calm or make less severe",
            "Monotony", "lack of variation"};
    public String[] N_words = {
            "Nadir",
            "The lowest point of anything",
            "Naive",
            "Marked by or showing unaffected simplicity",
            "Nascent",
            "Being born or beginning",
            "Neologism",
            "A newly invented word or phrase",
            "Neophyte",
            "Any new participant in some activity",
            "Nettle",
            "Plant having stinging hairs that cause skin irritation",
            "Noisome",
            "Causing or able to cause nausea",
            "Nominal",
            "Relating to or constituting or bearing or giving a name",
            "Nuance",
            "A subtle difference in meaning or opinion or attitude",
            "Numismatics",
            "The collection and study of money (and coins in particular)"
    };
    public String[] O_words = {
            "Obdurate", "Hardened in feeling, resistant to persuasion",
            "Obsequious", "Overly submissive and eager to please",
            "Obstinate", "Stubborn, unyielding",
            "Obviate", "To prevent, to make unnecessary",
            "Occlude", "To stop up; to prevent the passage of",
            "Onerous", "Troublesome and oppressive,; burdensome",
            "Opaque", "Impossible to see through; preventing the passage of light",
            "Opprobrium", "Public disgrace",
            "Ostentation", "Excessive showiness"

    };
    public String[] P_words = {

            "Paradox", "A contradiction or dilemma",
            "Paragon", "Model of excellence or perfection",
            "Pedant", "Someone who shows off learning",
            "Perfidious", "Willing to betray one's trust",
            "Perfunctory", "Done in a routine day, indifferent",
            "Permeate", "To penetrate",
            "Philanthropy", "Charity; a desire or effort to promote goodness",
            "Placate", "To soothe or pacify",
            "Plastic", "Able to be molded, altered, or bent",
            "Plethora", "Excess",
            "Pragmatic", "Practical as opposed to idealistic",
            "Precipitate", "To throw violently or bring about abruptly lacking deliberation",
            "Prevaricate", "To lie of deviate from the truth",
            "Pristine", "Fresh and clean; uncorrupted",
            "Prodigal", "Lavish, wasteful",
            "Proliferate", "To increase in number quickly",
            "Propitiate", "To conciliate; to appease",
            "Propriety", "Correct behavior; obedience to rules and customs",
            "Prudence", "Wisdom, caution, or restraint",
            "Pungent", "Sharp and irritating to the senses",


    };
    public String[] Q_words = {

            "Querulous",
            "Habitually complaining",
            "Quiescent",
            "Being quiet or still or inactive",
            "Quixotic",
            "Not sensible about practical matters",
            "Quotidian",
            "Found in the ordinary course of events"

    };
    public String[] R_words = {

            "Rarefy", "To make things thinner or sparser",
            "Repudiate", "To reject the validity of",
            "Reticent", "Silent, reserved",
            "Rhetoric", "Effective writing or speaking",
            "Rejoinder",
            "A quick reply to a question or remark",

            "Replete",
            "Filled to satisfaction with food or drink",
            "Repose",
            "Freedom from activity",
            "Repudiate",
            "Refuse to acknowledge, ratify, or recognize as valid",
            "Requite",
            "Make repayment for or return something",
            "Ribald",
            "Humorously vulgar",
            "Rococo",
            "Having excessive asymmetrical ornamentation",
            "Rustic",
            "Characteristic of rural life",

    };
    public String[] S_words = {

            "Sagacious",
            "Acutely insightful and wise",
            "Salient",
            "Having a quality that thrusts itself into attention",

            "Sanguine",
            "Confidently optimistic and cheerful",

            "Satiate", "To satisfy fully or overindulge",
            "Seraphic",
            "Having a sweet nature befitting an angel",
            "Sinecure",
            "A job that involves minimal duties",
            "Slake",
            "Satisfy, as thirst",
            "Soporific", "Causing sleep or lethargy",
            "Specious", "Deceptively attractive; seemingly plausible but fallacious",
            "Stasis",
            "Inactivity resulting from a balance between opposing forces",

            "Stigma", "A mark of shame or discredit",
            "Stolid", "Unemotional, lacking sensitivity",
            "Sublime", "Lofty or grand",
            "Symbiosis",
            "The relation between two interdependent species of organisms"

    };
    public String[] T_words = {

            "Tacit", "Done without using words",
            "Taciturn", "Silent, not talkative",

            "Terrestrial",
            "Of or relating to or characteristic of the planet Earth",


            "Tirade", "Long harsh speech or verbal attack",
            "Toady",
            "A person who tries to please someone to gain an advantage",
            "Torpor", "Extreme mental of physical sluggishness",
            "Transitory", "Temporary, lasting a brief time",

            "Turgid",
            "Ostentatiously lofty in style",
            "Tyro",
            "Someone new to a field or activity",

    };
    public String[] U_words = {

            "Umbrage",
            "A feeling of anger caused by being offended",
            "Unconscionable",
            "Greatly exceeding bounds of reason or moderation",
            "Unequivocal",
            "Admitting of no doubt or misunderstanding",
            "Upbraid",
            "Express criticism towards",
            "Usury",
            "The act of lending money at an exorbitant rate of interest",

    };
    public String[] V_words = {

            "Vacillate",	"To sway physically; to be indecisive",
    "Venerate",	"To respect deeply",
    "Veracity",	"Filled with truth and accuracy",
    "Verbose",	"Wordy",
    "Vex",	"To annoy",

            "Vim",
            "A healthy capacity for vigorous activity",
    "Viscous",
    "Having a relatively high resistance to flow",



    "Volatile"	,"Easily aroused or changeable;lively or explosive"

};
    public String[] W_words = {


            "Wanton",
            "Lewd or lascivious woman",
            "Waver",
            "Pause or hold back in uncertainty or unwillingness",
            "Whimsical",
            "Determined by chance or impulse rather than by necessity",

            "Winsome",
            "Charming in a childlike or naive way",
            "Wizened",
            "Lean and wrinkled by shrinkage as from age or illness",
            "Wraith",
            "A mental representation of some haunting experience",
    };
    public String[] X_words = {
            "Xenophobia",
            "A fear of foreigners or strangers"
    };
    public String[] Y_words = {
            "Yoke",
            "Support consisting of a wooden frame across the shoulders"
    };
    public String[] Z_words = {

            "Zeal",
            "A feeling of strong eagerness",
            "Zealot",
            "A fervent and even militant proponent of something",

    };


    @Override
    public void registerForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/tiza.ttf");
        Button listtopbutton = (Button) (findViewById(R.id.listtopButton));


//        listtopbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent i = new Intent(ListActivity.this, MainActivityList.class);
//
//
//                startActivity(i);
//
//
//            }
//        });
        context = this;

        lv = (ListView) findViewById(R.id.listView);

        int click = getIntent().getIntExtra("click", 0);


        if (click == 1) {

            listtopbutton.setText("A");
            //listtopbutton.setTypeface(tf2);


            String[] words = new String[A_words.length / 2];

            String[] words_mean = new String[A_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < A_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = A_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = A_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 2) {
            listtopbutton.setText("B");
            String[] words = new String[B_words.length / 2];

            String[] words_mean = new String[B_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < B_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = B_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = B_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));

        } else if (click == 3) {
            listtopbutton.setText("C");
            String[] words = new String[C_words.length / 2];

            String[] words_mean = new String[C_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < C_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = C_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = C_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 4) {

            listtopbutton.setText("D");
            String[] words = new String[D_words.length / 2];
            String[] words_mean = new String[D_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < D_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = D_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = D_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 5) {
            listtopbutton.setText("E");
            String[] words = new String[E_words.length / 2];
            String[] words_mean = new String[E_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < E_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = E_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = E_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 6) {
            listtopbutton.setText("F");
            String[] words = new String[F_words.length / 2];
            String[] words_mean = new String[F_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < F_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = F_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = F_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 7) {
            listtopbutton.setText("G");
            String[] words = new String[G_words.length / 2];
            String[] words_mean = new String[G_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < G_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = G_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = G_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        } else if (click == 8) {
            String[] words = new String[H_words.length / 2];
            String[] words_mean = new String[H_words.length / 2];
            listtopbutton.setText("H");
            int n = 0;
            int m = 0;
            for (int i = 0; i < H_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = H_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = H_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 9) {
            String[] words = new String[I_words.length / 2];
            String[] words_mean = new String[I_words.length / 2];
            listtopbutton.setText("I");
            int n = 0;
            int m = 0;
            for (int i = 0; i < I_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = I_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = I_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 10) {
            listtopbutton.setText("J");
            String[] words = new String[J_words.length / 2];
            String[] words_mean = new String[J_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < J_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = J_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = J_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 11) {
            listtopbutton.setText("K");
            String[] words = new String[K_words.length / 2];
            String[] words_mean = new String[K_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < K_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = K_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = K_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 12) {
            listtopbutton.setText("L");
            String[] words = new String[L_words.length / 2];
            String[] words_mean = new String[L_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < L_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = L_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = L_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 13) {
            listtopbutton.setText("M");
            String[] words = new String[M_words.length / 2];
            String[] words_mean = new String[M_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < M_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = M_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = M_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 14) {
            listtopbutton.setText("N");
            String[] words = new String[N_words.length / 2];
            String[] words_mean = new String[N_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < N_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = N_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = N_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 15) {
            listtopbutton.setText("O");
            String[] words = new String[O_words.length / 2];
            String[] words_mean = new String[O_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < O_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = O_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = O_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 16) {
            listtopbutton.setText("P");
            String[] words = new String[P_words.length / 2];
            String[] words_mean = new String[P_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < P_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = P_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = P_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 17) {
            listtopbutton.setText("Q");
            String[] words = new String[Q_words.length / 2];
            String[] words_mean = new String[Q_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < Q_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = Q_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = Q_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 18) {
            listtopbutton.setText("R");
            String[] words = new String[R_words.length / 2];
            String[] words_mean = new String[R_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < R_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = R_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = R_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 19) {
            listtopbutton.setText("S");
            String[] words = new String[S_words.length / 2];
            String[] words_mean = new String[S_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < S_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = S_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = S_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 20) {
            listtopbutton.setText("T");
            String[] words = new String[T_words.length / 2];
            String[] words_mean = new String[T_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < T_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = T_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = T_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 21) {
            listtopbutton.setText("U");
            String[] words = new String[U_words.length / 2];
            String[] words_mean = new String[T_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < U_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = U_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = U_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 22) {
            listtopbutton.setText("V");
            String[] words = new String[V_words.length / 2];
            String[] words_mean = new String[V_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < V_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = V_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = V_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }

        else if (click == 23) {
            listtopbutton.setText("W");
            String[] words = new String[W_words.length / 2];
            String[] words_mean = new String[W_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < W_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = W_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = W_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 24) {
            listtopbutton.setText("X");
            String[] words = new String[X_words.length / 2];
            String[] words_mean = new String[X_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < X_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = X_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = X_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 25) {
            listtopbutton.setText("Y");
            String[] words = new String[Y_words.length / 2];
            String[] words_mean = new String[Y_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < Y_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = Y_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = Y_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        else if (click == 26) {
            listtopbutton.setText("Z");
            String[] words = new String[Z_words.length / 2];
            String[] words_mean = new String[T_words.length / 2];
            int n = 0;
            int m = 0;
            for (int i = 0; i < Z_words.length; i++) {

                if (i % 2 == 0) {
                    words[n] = Z_words[i];
                    n = n + 1;

                } else {
                    words_mean[m] = Z_words[i];
                    m = m + 1;
                }
            }
            lv.setAdapter(new ListAdapter(this, words, words_mean));
        }
        listtopbutton.setTypeface(tf1);

    }


}